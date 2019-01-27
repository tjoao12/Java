import java.applet.Applet;

import java.awt.*;


public class Hello extends Applet{
      
  Font f;
   
  int counter;
   
  public void init() {
     
    f = new Font("Helvetica", Font.BOLD,22);
      //setBackground (Color.yellow);
   
  }
  
   public void paint (Graphics g) {
     
     g.setColor(Color.white);
     
     setBackground(Color.black);
     
     g.setFont(f);
     
     String s = "Counter writes: " + counter++;
     
     showStatus(s);
     
     g.drawString("Helllo World!", 2, 20);
     
     System.out.println(counter);
   }
   
   
   int counter()
   
   {
     return counter();
   }
}
