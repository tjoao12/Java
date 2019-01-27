import java.util.*;
public class areaOfCircle {

  public static void main (String args []) 
  {
    double pi, radius, area, radiussquared;
    
    Scanner sc = new Scanner (System.in);
    /*Math.*/pi = 3.14;
    
    System.out.println ("Enter Radius of circle");
    
    radius = sc.nextInt ();
    
    radiussquared = (radius * radius);
    
    area =( pi * radiussquared);
    
    System.out.println ("Area of circle is " + area);
  }
}