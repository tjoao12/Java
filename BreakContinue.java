import java.util.*;

public class BreakContinue {
  
  public static void main(String args []) {
    
  int Number=1;
    
  Scanner sc = new Scanner(System.in);
    
    while (Number!=0) 
    
    {
      System.out.println("Enter a positive integer");
      
      System.out.println("or 0 to exit");
      
      Number = sc.nextInt();
      
      if (Number>0){
        
      System.out.println("Squareroot of" + Number);
      
      System.out.println(" = " + Math.sqrt(Number));
      
    }
      else
    {
    
        System.out.println("a zero was entered");
    
    }
    }
    }
}