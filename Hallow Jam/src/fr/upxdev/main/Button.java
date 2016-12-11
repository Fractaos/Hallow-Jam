package fr.upxdev.main;
//BY FRANK THERMEAU
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Button extends GameObject{
	
	private int width;
	private int height;
	private int textX;
	private int textY;
	private int textSize;
	private Color colorButton;
	private Color colorText;
	private String text;
	public int numBut;
	
	public Button(int x, int y, int size, int num, String text, ID id){
		super(x, y, id);
		this.textSize=size;
		this.textX=this.x+10;
		this.textY=this.y+15;
		this.colorButton=Color.DARK_GRAY;
		this.colorText=Color.LIGHT_GRAY;
		this.text=text;
		this.numBut=num;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getTextX() {
		return textX;
	}

	public void setTextX(int textX) {
		this.textX = textX;
	}

	public int getTextY() {
		return textY;
	}

	public void setTextY(int textY) {
		this.textY = textY;
	}

	public int getTextSize() {
		return textSize;
	}

	public void setTextSize(int textSize) {
		this.textSize = textSize;
	}
	
	public Color getColorButton(){
		return this.colorButton;
	}
	
	public void setColorButton(Color c){
		this.colorButton=c;
	}
	
	public Color getColorText(){
		return this.colorText;
	}
	
	public void setColorText(Color c){
		this.colorText=c;
	}
	
	public String getText(){
		return this.text;
	}
	
	public void setText(String text){
		this.text=text;
	}

	public void tick() {
		
		
	}

	public void render(Graphics g) {
		if(!this.text.equals("")){
			g.setFont(new Font("Dialog", Font.BOLD, this.textSize));
			this.width=g.getFontMetrics().stringWidth(this.text)+20;
			this.height=g.getFontMetrics().getHeight()+5;
			g.setColor(this.colorButton);
			g.fillRect(this.x, this.y, this.width, this.height);
			g.setColor(this.colorText);
			g.drawString(this.text, this.textX, this.textY);
		}
		
		
		
	}

}
