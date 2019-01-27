import java.util.*;

public class BankBalance {
  public static void main (String [] args) {
    
    System.out.println("Please enter a balance");
    Scanner input = new Scanner(System.in);
    int balance = input.nextInt();
    System.out.println("Command (1 to withdraw, 2 to deposit):");
    int userInput = input.nextInt();
    if(userInput == 1){
    System.out.println( "What is the amount to withdraw?: ");
    int amount = input.nextInt();
    System.out.println( "Your new balance is: " + (balance-amount));
    }
    if (userInput == 2) {
    System.out.println( " What is the amount to deposit?: ");
    int amount = input.nextInt();
    System.out.println( "Your new balance is: " + (balance+amount));
  }
}
}