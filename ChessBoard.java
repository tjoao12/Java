import java.awt.Graphics;

import java.applet.Applet;

import java.awt.Color;   

public class ChessBoard2 extends Applet
{
 
 public void paint(Graphics g)
 
{
  int boxWidth = 20; 

  boolean blackSquare = true;
  
  for (int y=0; y<8; y++) 
  {
   for (int x=0; x<8; x++) 
   {
    if (blackSquare) g.setColor(Color.black);  
    
    else g.setColor(Color.white); 
    
    blackSquare = !blackSquare; 
    
    g.fillRect((x*boxWidth),(y*boxWidth),boxWidth,boxWidth);
    
   }
   
   blackSquare = !blackSquare; 
  
  }
 }
}