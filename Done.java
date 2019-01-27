import java.util.*;


public class Done {

  
  public static void main(String []args) {
 Scanner sc = new Scanner(System.in);
 String word= sc.next();
 
 System.out.println("Please enter a list of words, enter Done to terminate");
 
 while(!word.equalsIgnoreCase("Done")) {
    
  if ((word.charAt(0))==(word.charAt(word.length()-1)))
  {
    System.out.println("The first character and the last character of this word are equal");
  }
  else 
  {
      System.out.println("End of program");
  }
  word =sc.next();
 }

}

}
                             

                             
                             
                             
                            
