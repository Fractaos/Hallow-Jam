package fr.upxdev.main;
//BY FRANK THERMEAU
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.IOException;

import javax.swing.JOptionPane;



public class Game extends Canvas implements Runnable{
	public static int storyLine=0;
	public static int storyColumn=0;
	public static HUD hud;
	public static Menu menu;
	public static String gameName="Au coeur de la pierre";
	public static State gameState=State.GameOver;
	
	private static final long serialVersionUID = -4021390787203127274L;
	
	public static final int WIDTH = 1080, HEIGHT = WIDTH /16*9;
	private Thread thread;
	private boolean running = false;
	
	private Handler handler;
	
	
	
	public Game(){
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));
		this.addMouseListener(new MouseInput(handler));
		new Window(WIDTH, HEIGHT, gameName, this);
		
		handler.addObject(new Player(150,150,ID.Player));
		handler.addObject(new Text(WIDTH-((int)(WIDTH/1.38)), 50, ID.Text));
		menu = new Menu(handler, TypeMenu.MainMenu);
		
		
		
	}
	public synchronized void start(){
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop(){
		try{
			thread.join();
			running = false;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void run(){
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime= now;
			while(delta>=1){
				tick();
				delta--;
			}
			if(running){
				try {
					render();
				} catch (FontFormatException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frames++;
			}
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				//System.out.println("FPS " + frames);
				frames = 0;
			}
		}
		
		stop();
		
	}
	
	private void tick(){
		handler.tick();
		if(gameState==State.Game){
			hud.tick();
		}else if(gameState==State.Menu || gameState==State.GameOver){
			menu.tick();
		}
		
		

		
		
	}
	
	private void render() throws FontFormatException, IOException{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null){
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		
		handler.render(g);
		if(gameState==State.Game){
			hud.render(g);
		}else if(gameState==State.Menu || gameState==State.GameOver){
			menu.render(g);
		}
		

			
		
		
		
		
		g.dispose();
		bs.show();
	}
	public static void main(String args[]) throws Exception{
		new Game();
	}
	
	public static int clamp(int var, int min, int max){
		if(var>=max){
			return var = max;
		}else if(var<=min){
			return var = min;
		}else{
			return var;
		}
		
	}
	
	public static boolean checkIfPlayer(GameObject go){
		if(go.id==ID.Player){
			return true;
		}else{
			return false;
		}	
	}
	
	public static boolean checkIfButton(GameObject go){
		if(go.id==ID.Button){
			return true;
		}else{
			return false;
		}	
	}
	
	public static boolean checkIfText(GameObject go){
		if(go.id==ID.Text){
			return true;
		}else{
			return false;
		}
	}
	

}
