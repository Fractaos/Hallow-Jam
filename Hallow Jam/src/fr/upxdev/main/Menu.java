package fr.upxdev.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.net.URL;

public class Menu {
	
	private Handler handler;
	private int xTitle;
	private int yTitle;
	private String title;
	private Font font;
	private TypeMenu type;
	
	
	public Menu(Handler handler, TypeMenu tm){
		this.handler=handler;
		this.title=Game.gameName;
		this.xTitle=Game.WIDTH/2;
		this.yTitle=Game.HEIGHT/2;
		this.type=tm;
		if(this.type==TypeMenu.MainMenu){
			handler.addObject(new Button(500, 300, 12, 5, "JOUER", ID.Button));
		}else if(this.type==TypeMenu.GameOver){
			handler.addObject(new Button(500, 300, 12, 5, "RETOUR AU MENU PRINCIPAL", ID.Button));
		}
		
		
	}
	
	public void setMenuType(TypeMenu tm){
		if(this.type==TypeMenu.GameOver){
			handler.addObject(new Button(500, 300, 12, 5, "JOUER", ID.Button));
		}
		this.type=tm;
	}

	public Font createFont(String fontURL, int fontSize, int fontType) throws FontFormatException, IOException{
		URL fontUrl = new URL(fontURL);
		Font font = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream());
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(font);
		font = font.deriveFont(fontType, fontSize);
		return font;
	}
	
	public void checkTypeAndState(){
		if(this.type==TypeMenu.GameOver){
			Game.gameState=State.GameOver;
		}else if(this.type==TypeMenu.MainMenu){
			Game.gameState=State.Menu;
		}
	}
	
	public void tick(){
		checkTypeAndState();
	}
	
	public void render(Graphics g) throws FontFormatException, IOException{
		if(this.type==TypeMenu.MainMenu){
			this.font=createFont("file:///D:/Users/Frank/Documents/eclipse/Hallow Jam/font/SpecialElite.ttf", 45, Font.BOLD);
			g.setFont(this.font);
			this.xTitle=((Game.WIDTH/2)-g.getFontMetrics().stringWidth(this.title)/2);
			this.yTitle=((Game.HEIGHT/3)-g.getFontMetrics().getHeight()/2);
			g.setColor(Color.RED);
			g.drawString(this.title, this.xTitle, this.yTitle);
		}else if(this.type==TypeMenu.GameOver){
			this.font=createFont("file:///D:/Users/Frank/Documents/eclipse/Hallow Jam/font/SpecialElite.ttf", 60, Font.BOLD);
			g.setFont(this.font);
			this.xTitle=((Game.WIDTH/2)-g.getFontMetrics().stringWidth("Game Over")/2);
			this.yTitle=((Game.HEIGHT/3)-g.getFontMetrics().getHeight()/2);
			g.setColor(Color.RED);
			g.drawString("Game Over", this.xTitle, this.yTitle);
		}
		
		
		
	}

}
