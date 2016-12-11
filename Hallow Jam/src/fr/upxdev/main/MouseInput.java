package fr.upxdev.main;
//BY FRANK THERMEAU
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class MouseInput extends MouseAdapter{
	
	private Handler handler;
	
	public MouseInput(Handler handler){
		this.handler=handler;
	}
	
	public void mousePressed(MouseEvent m){
		int mouseX = m.getX();
		int mouseY = m.getY();
		for(int i=0; i<handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			if(tempObject.id==ID.Button){
				Button tempButton = (Button) tempObject;
				if(clickButton(tempButton, mouseX, mouseY)){
					switch(tempButton.numBut){
					case 1:
						System.out.println("Button 1 Pressed!");
						switch(Game.storyLine){
						case 0:
							Game.storyLine++;
							Game.storyColumn=0;
							break;
						case 1:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=0;
								//Traverse du monstre -10hp
								for(int k=0;k<handler.object.size(); k++){
									GameObject tempObject2 = handler.object.get(k);
									if(tempObject2.id==ID.Player){
										Player tempPlayer = (Player) tempObject2;
										tempPlayer.setHp(tempPlayer.getHp()-10);
									}
								}
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=0;
								//Traverse du monstre -10hp
								for(int k=0;k<handler.object.size(); k++){
									GameObject tempObject2 = handler.object.get(k);
									if(tempObject2.id==ID.Player){
										Player tempPlayer = (Player) tempObject2;
										tempPlayer.setHp(tempPlayer.getHp()-10);
									}
								}
								break;
							}
							break;
						case 2:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=0;
							}
							
							break;
						case 3:
							Game.storyLine++;
							Game.storyColumn=0;
							break;
						case 4:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine+=2;
								Game.storyColumn=0;
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 2:
								Game.storyLine+=2;
								Game.storyColumn=2;
								break;
							}
							
							break;
						case 5:
							Game.storyLine++;
							Game.storyColumn=2;
							//Traverse du monstre -10hp
							for(int k=0;k<handler.object.size(); k++){
								GameObject tempObject2 = handler.object.get(k);
								if(tempObject2.id==ID.Player){
									Player tempPlayer = (Player) tempObject2;
									tempPlayer.setHp(tempPlayer.getHp()-10);
								}
							}
							break;
						case 6:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							case 2:
								Game.storyLine++;
								Game.storyColumn=4;
								break;
							}
							
							break;
						case 7:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=0;
								//-1bras -30hp
								for(int k=0;k<handler.object.size(); k++){
									GameObject tempObject2 = handler.object.get(k);
									if(tempObject2.id==ID.Player){
										Player tempPlayer = (Player) tempObject2;
										tempPlayer.setHp(tempPlayer.getHp()-30);
									}
								}
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 2:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							case 3:
								Game.storyLine++;
								Game.storyColumn=3;
								break;
							case 4:
								Game.storyLine++;
								Game.storyColumn=4;
								break;
							case 5:
								Game.storyLine++;
								Game.storyColumn=5;
								break;
							}
							
							break;
						case 8:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							case 2:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 3:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							case 4:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							case 5:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							case 6:
								System.out.println("MORT");
								for(int k=0; k<handler.object.size(); k++){
									GameObject tempObject2 = handler.object.get(k);
									if(tempObject.id==ID.Player){
										Player p = (Player)tempObject2;
										p.setHp(0);
									}
								}
								break;
							}
							
							break;
						}
						break;
					case 2:
						System.out.println("Button 2 Pressed!");
						switch(Game.storyLine){
						case 0:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							}
							break;
						case 1:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=1;
								
								break;
							}
							break;
						case 2:
							switch(Game.storyColumn){
							case 1:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							}
							break;
						case 3:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							}
							break;
						case 4:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 1:
								Game.storyLine+=2;
								Game.storyColumn=1;
								break;
							}
							break;
						case 6:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=3;
								break;
							case 2:
								Game.storyLine++;
								Game.storyColumn=5;
								break;
							}
							break;
						case 7:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=1;
								//Trainée du chien -10hp
								for(int k=0;k<handler.object.size(); k++){
									GameObject tempObject2 = handler.object.get(k);
									if(tempObject2.id==ID.Player){
										Player tempPlayer = (Player) tempObject2;
										tempPlayer.setHp(tempPlayer.getHp()-10);
									}
								}
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=1;
								break;
							case 2:
								Game.storyLine++;
								Game.storyColumn=3;
								break;
							case 3:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							case 4:
								Game.storyLine++;
								Game.storyColumn=5;
								break;
							case 5:
								Game.storyLine++;
								Game.storyColumn=6;
								break;
							}
							break;
						case 8:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 1:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							case 2:
								Game.storyLine++;
								Game.storyColumn=0;
								break;
							case 3:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							case 4:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							case 5:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							case 6:
								System.out.println("MORT");
								for(int k=0; k<handler.object.size(); k++){
									GameObject tempObject2 = handler.object.get(k);
									if(tempObject.id==ID.Player){
										Player p = (Player)tempObject2;
										p.setHp(0);
									}
								}
								
								break;
							}
							break;
						case 9:
							Game.menu.setMenuType(TypeMenu.GameOver);
						}
						break;
					case 3:
						System.out.println("Button 3 Pressed!");
						switch(Game.storyLine){
						case 3:
							switch(Game.storyColumn){
							case 0:
								Game.storyLine++;
								Game.storyColumn=2;
								break;
							}
							break;
						}
						break;
					case 5:
						if(Game.gameState==State.Menu){
							System.out.println("Button 5 Pressed!");
							
							for(int k=0;k<handler.object.size();k++){
								if(handler.object.get(k).id==ID.Player){
									Player player = (Player) handler.object.get(k);
									if(player.getName().equals("null")){
										player.setName(JOptionPane.showInputDialog("Quel est votre nom?"));
										while(player.getName().length()>15){
											player.setName(JOptionPane.showInputDialog("Quel est votre nom?"));
										}
										
									}
								}
								handler.object.remove(tempButton);
								
							}
							Game.hud=new HUD(handler);
							
							Game.gameState=State.Game;
						}else if(Game.gameState==State.GameOver){
							System.out.println("Button 5 Pressed!");
							handler.object.remove(tempButton);
							Game.menu.setMenuType(TypeMenu.MainMenu);
						}
						
					}
					
					
					
				}
				
			}
		}
		System.out.println("X : "+mouseX+" Y : "+mouseY);
		
		
		
		
	}
	
	public boolean clickButton(Button b, int mouseX, int mouseY){
		if((mouseX>=b.getX() && mouseX<=(b.getX()+b.getWidth()))&&(mouseY>=b.getY() && mouseY<=(b.getY()+b.getHeight()))){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public void mouseReleased(MouseEvent m){
		int mouse = m.getButton();
	}

}
