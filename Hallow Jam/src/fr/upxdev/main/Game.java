package fr.upxdev.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JOptionPane;



public class Game extends Canvas implements Runnable{
	public static int storyLine=0;
	public static int storyColumn=0;
	public static boolean looseHp=false;
	
	private static final long serialVersionUID = -4021390787203127274L;
	
	public static final int WIDTH = 1080, HEIGHT = WIDTH /16*9;
	private Thread thread;
	private boolean running = false;
	
	private Handler handler;
	private HUD hud;
	
	public Game(){
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));
		this.addMouseListener(new MouseInput(handler));
		new Window(WIDTH, HEIGHT, "Hallow Jam", this);
		
		
		handler.addObject(new Player(150,150,ID.Player));
		handler.addObject(new Text(WIDTH-((int)(WIDTH/1.38)), 50, ID.Text));
		hud = new HUD(handler);
		
		
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
				render();
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
		hud.tick();
	}
	
	private void render(){
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null){
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		
		handler.render(g);
		for(int i=0;i<handler.object.size();i++){
			if(handler.object.get(i).id==ID.Player){
				Player player = (Player) handler.object.get(i);
				if(player.getName().equals("null")){
					player.setName(JOptionPane.showInputDialog("Quel est votre nom?"));
					while(player.getName().length()>15){
						player.setName(JOptionPane.showInputDialog("Quel est votre nom?"));
					}
					
				}
			}
			
		}
		
		hud.render(g);
		
		
		g.dispose();
		bs.show();
	}
	public static void main(String args[]){
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
