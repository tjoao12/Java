import java.util. *;


public class Switchbank {
  public static void main (String [] args) {
    
    System.out.println("Please enter a balance?");
      Scanner input = new Scanner(System.in);
      int Balance = input.nextInt();
     
      System.out.println( "Command (S)aver, (D)eposit, (C)hild, and (L)ong term investment");
      Scanner reader = new Scanner(System.in);
      
      char c = reader.findInLine(".").charAt(0);
      
      switch (c) {
        
        case 's':
        case 'S':
          if (Balance<100){
          System.out.println("Error . " + Balance + " is below minimum balance for this account");}
          else {
          double money = Balance * 0.03;
          double afterYear = money + Balance;
               System.out.println("Value after one year is: " + afterYear); 
               
          }   
          
          break;
      
        case 'd':
        case 'D':
          if (Balance<1){
          System.out.println("Error . " + Balance +"is below minimum balance for this account");}
          else {
          double moneyd = Balance * 0.05;
          double afteryear = moneyd + Balance;
               System.out.println("Value after one year is: " + afteryear);
               
          }
          
      
        break;
      
        case 'c':
        case 'C':
          if (Balance<1){
          System.out.println("Error . " + Balance +"is below minimum balance for this account");}
          else {
          double moneyc = Balance * 0.015;
          double afterYear = moneyc + Balance;
               System.out.println("Value after one year is: " + afterYear);
               
          }
         
          break;
        case 'l':
        case 'L':
          if (Balance<1){
          System.out.println("Error . " + Balance +"is below minimum balance for this account");}
          else {
          double moneyd = Balance * 0.4;
          double afterYear = moneyd + Balance;
               System.out.println("Value after one year is: " + afterYear);
               
          }
          
  }
  }
}