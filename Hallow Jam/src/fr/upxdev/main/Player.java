package fr.upxdev.main;
//BY FRANK THERMEAU
import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
	
	private Color c;
	private String name;
	private int maxHp;
	private int hp;
	private int strength;
	private int agility;
	private int luck;
	private int intel;
	//private String state;
	
	public Player(int x, int y, ID id){
		super(x, y, id);
		this.c=Color.WHITE;
		this.name="null";
		this.maxHp=100;
		this.hp=this.maxHp;
		this.strength=50;
		this.agility=50;
		this.luck=50;
		this.intel=50;
		//this.state="";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStrength() {
		return this.strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return this.agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getLuck() {
		return this.luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	public int getIntel(){
		return this.intel;
	}
	
	public void setIntel(int intel){
		this.intel=intel;
	}
	
	/*public String getState(){
		return this.state;
	}*/
	
	/*public void setState(String state){
		this.state=state;
	}*/

	
	
	public Color getColor(){
		return this.c;
	}
	
	public void setColor(Color c){
		this.c=c;
	}
	
	public void tick(){
		
		this.hp = Game.clamp(hp, 0, 100);
		/*if(Game.looseHp){
			this.hp-=10;
		}*/
		
		
	}
	
	public void render(Graphics g){
		
		
		
		
	}

}
