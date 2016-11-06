package fr.upxdev.main;
//BY FRANK THERMEAU
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {
	
	private final int SPACE=50;
	private final int SPACE_STATS=25;
	
	//Cadre HUD joueur
	private int width;
	private int height;
	private int alignX;
	
	//Cadre HUD choix
	
	private int widthChoice;
	private int heightChoice;
	private int xChoice;
	private int yChoice;
	
	//Cadre HUD texte
	
	private int widthText;
	private int heightText;
	private int xText;
	private int yText;
	
	//Cadre nom joueur
	private int playerNameX;
	private int playerHealthBarX;
	private int playerNameY;
	private int playerHealthBarY;
	private int playerNameBoxX;
	private int playerNameBoxY;
	private int playerNameBoxWidth;
	
	//Barre de vie du joueur
	private int playerHealthBarMaxWidth;
	private int playerHealthBarWidth;
	private int playerNameBoxHeight;
	private int playerHealthBarHeight;
	
	//Stats du joueur
	private String playerName;
	private int playerHP;
	private int playerMaxHp;
	private Handler handler;
	private int playerAgi;
	private int playerStr;
	private int playerLk;
	private int playerInt;
	//private String playerState;
	
	private int playerHPX;
	private int playerHPY;
	private int playerAgiX;
	private int playerAgiY;
	private int playerStrX;
	private int playerStrY;
	private int playerLkX;
	private int playerLkY;
	private int playerIntX;
	private int playerIntY;
	/*private int playerStateX;
	private int playerStateY;*/
	
	
	public HUD(Handler handler){
		
		
		//Cadre HUD
		this.width=Game.WIDTH/4;
		this.height=Game.HEIGHT-30;
		this.handler=handler;
		
		
		
		//Cadre nom joueur this.width/2
		this.alignX=this.width/4;
		//this.playerNameBoxWidth=;
		this.playerNameBoxHeight=this.height/15;
		this.playerNameBoxX=this.alignX;
		this.playerNameBoxY=this.height/15;
		this.playerNameX=this.playerNameBoxX+20;
		this.playerNameY=this.playerNameBoxY+25;
		
		//Cadre HUD choix
		
		this.widthChoice=(Game.WIDTH-this.width)-8;
		this.heightChoice=Game.HEIGHT/5;
		this.xChoice=this.width+1;
		this.yChoice=(this.heightChoice*4)-30;
		
		//Cadre HUD texte
		
		this.widthText=(Game.WIDTH-this.width)-8;
		this.heightText=(Game.HEIGHT-this.heightChoice)-31;
		this.xText=this.width+1;
		this.yText=0;
		
		
		
		//Barre de vie du joueur && stats joueurs
		this.playerHealthBarX=this.playerNameBoxX;
		this.playerHealthBarY=this.playerNameBoxY+SPACE;
		
		//Boutons
				for(int i=0;i<handler.object.size();i++){
					if(Game.checkIfPlayer(handler.object.get(i))){
						Player player = (Player) handler.object.get(i);
						this.playerHP=player.getHp();
						this.playerMaxHp=player.getMaxHp();
						this.playerName=player.getName();
						this.playerAgi=player.getAgility();
						this.playerStr=player.getStrength();
						this.playerLk=player.getLuck();
						this.playerInt=player.getIntel();
						//this.playerState=player.getState();
					}else if(Game.checkIfText(handler.object.get(i))){
						Text text = (Text) handler.object.get(i);
						handler.addObject(new Button(((int)(Game.WIDTH/2.1)), (int)(Game.HEIGHT/1.30), 12, 1, text.checkChoice(Game.storyLine, Game.storyColumn, 0), ID.Button));
						handler.addObject(new Button(((int)(Game.WIDTH/2.1)), (int)(Game.HEIGHT/1.20), 12, 2, text.checkChoice(Game.storyLine, Game.storyColumn, 1), ID.Button));
						handler.addObject(new Button(((int)(Game.WIDTH/2.1)), (int)(Game.HEIGHT/1.11), 12, 3, text.checkChoice(Game.storyLine, Game.storyColumn, 2), ID.Button));

						
				
					}
				}
		
		this.playerHealthBarMaxWidth=(int)(this.playerMaxHp*0.9);
		this.playerHealthBarHeight=this.height/20;
		
		
		//Stats 
		//HP
		this.playerHPX=this.alignX;
		this.playerHPY=this.playerHealthBarY+SPACE;
		//Agility
		this.playerAgiX=this.alignX;
		this.playerAgiY=this.playerHPY+SPACE_STATS;
		//Strength
		this.playerStrX=this.alignX;
		this.playerStrY=this.playerAgiY+SPACE_STATS;
		//Luck
		this.playerLkX=this.alignX;
		this.playerLkY=this.playerStrY+SPACE_STATS;
		//Intel
		this.playerIntX=this.alignX;
		this.playerIntY=this.playerLkY+SPACE_STATS;
		//Statut
		/*this.playerStateX=this.alignX;
		this.playerStateY=this.playerIntY+SPACE_STATS;*/
		
		
		
		
		
	}

	public void tick() {
		for(int i=0;i<handler.object.size();i++){
			if(Game.checkIfPlayer(handler.object.get(i))){
				Player player = (Player) handler.object.get(i);
				this.playerHP=player.getHp();
				this.playerName=player.getName();
				this.playerAgi=player.getAgility();
				this.playerStr=player.getStrength();
				this.playerLk=player.getLuck();
				this.playerInt=player.getIntel();
				//this.playerState=player.getState();
				this.playerHealthBarWidth=(int)(this.playerHP*0.9);
			}else if(Game.checkIfText(handler.object.get(i))){
				Text text = (Text) handler.object.get(i);
				for(int j=0; j<handler.object.size();j++){
					if(Game.checkIfButton(handler.object.get(j))){
						Button tempButton = (Button) handler.object.get(j);
						switch(tempButton.numBut){
						case 1:
							tempButton.setText(text.checkChoice(Game.storyLine, Game.storyColumn, 0));
							break;
						case 2:
							tempButton.setText(text.checkChoice(Game.storyLine, Game.storyColumn, 1));
							break;
						case 3:
							tempButton.setText(text.checkChoice(Game.storyLine, Game.storyColumn, 2));
							break;
						}
					}
				}
			}
		}
		
	}

	public void render(Graphics g) {
		//Rectangle d'HUD
		g.setColor(Color.RED);
		g.drawRect(0, 0, this.width, this.height);
		
		//Rectangle d'HUD choix
		g.setColor(Color.CYAN);
		g.drawRect(this.xChoice, this.yChoice, this.widthChoice, this.heightChoice);
		
		//Rectangle d'HUD texte
		g.setColor(Color.YELLOW);
		g.drawRect(this.xText, this.yText, this.widthText, this.heightText);
		
		
		
		//Nom
		
		g.setFont(new Font("Dialog", Font.BOLD, 20));
		this.playerNameBoxWidth=g.getFontMetrics().stringWidth(playerName)+40;
		//Rectangle de container de nom
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(this.playerNameBoxX, this.playerNameBoxY, this.playerNameBoxWidth, this.playerNameBoxHeight);
		//Nom
		g.setColor(Color.BLACK);
		g.drawString(this.playerName, this.playerNameX, this.playerNameY);
		
		
		
		//Barre de vie vide
		g.setColor(Color.RED);
		g.fillRect(this.playerHealthBarX, this.playerHealthBarY, this.playerHealthBarMaxWidth, this.playerHealthBarHeight);
		
		//Barre de vie actuelle
		g.setColor(Color.GREEN);
		g.fillRect(this.playerHealthBarX, this.playerHealthBarY, this.playerHealthBarWidth, this.playerHealthBarHeight);
		
		//Contour de barre
		g.setColor(Color.WHITE);
		g.drawRect(this.playerHealthBarX, this.playerHealthBarY, this.playerHealthBarMaxWidth, this.playerHealthBarHeight);
		
		//Stats du joueur
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Dialog", Font.BOLD, 15));
		//HP
		g.drawString("PV : "+this.playerHP+"/"+this.playerMaxHp, this.playerHPX, this.playerHPY);
		//Agility
		g.drawString("Agilité : "+this.playerAgi, this.playerAgiX, this.playerAgiY);
		//Strength
		g.drawString("Force : "+this.playerStr, this.playerStrX, this.playerStrY);
		//Luck
		g.drawString("Chance : "+this.playerLk, this.playerLkX, this.playerLkY);
		//Intel
		g.drawString("Intelligence : "+this.playerInt, this.playerIntX, this.playerIntY);
		//State
		//g.drawString("Statut : "+this.playerState, this.playerStateX, this.playerStateY);
		
	}

}
