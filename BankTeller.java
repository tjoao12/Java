public class BankTeller2 {

public static void BankTeller(){
 
float Sterling=800.60f;
 
String indent= " ";
 
int Hundreds, Fifties, Twenties, Tens, Fives, Ones, fiftyPs, twentyPs, 

tenPs, fivePs, twoPs, onePs;
 
Ones= (int) Sterling;
onePs=(int)(Sterling*100)%100;
        
Hundreds=Ones/100;
Ones=Ones%100;
   
Fifties=Ones/50;
Ones=Ones%50;
       
Twenties=Ones/20;
Ones=Ones%20;
        
Tens=Ones/10;
Ones=Ones%10;
        
Fives=Ones/5;
Ones=Ones%5;
        
fiftyPs=onePs/50;
onePs=  onePs%50;
        
twentyPs=onePs/20;
onePs= onePs%20;
        
tenPs= onePs/10;
onePs= onePs%10;
        
fivePs= onePs/5;
onePs=  onePs%5;
        
twoPs=onePs/2;
onePs=onePs%2;
               
System.out.println("The notes are: ");
System.out.println();
waitNSeconds(3);
System.out.println(indent + "Hundreds: " + Hundreds);
waitNSeconds(4);
System.out.println(indent + "Fifties: " + Fifties);
waitNSeconds(5);
System.out.println(indent + "Twenties: " + Twenties);
waitNSeconds(6);
System.out.println(indent + "Tens: " + Tens);
waitNSeconds(7);
System.out.println(indent + "Fives: " + Fives);
waitNSeconds(3);
System.out.println(indent + "One Pound Coins: " + Ones);
waitNSeconds(4);
System.out.println(indent + "Fifty Pence Coins: " + fiftyPs);
System.out.println(indent + "Twenty Pence Coins: " + twentyPs);
System.out.println(indent + "Ten Pence Coins: " + tenPs);
System.out.println(indent + "Five Pence Coins: " + fivePs);
System.out.println(indent + "Two Pence Coins: " + twoPs);
System.out.println();
System.out.println("Total: " + Sterling + " Pounds");

}
public static void main(String[] args)  {

BankTeller();

}
 
public static void wait1second()

{
  
 long now = System.currentTimeMillis();
 
 long then = now + 1000; 
 
 while (System.currentTimeMillis() < then) {

 }
 
}

 public static void waitNSeconds(int number)

{
 int i;
 
 for (i = 0; i < number; i++) {
 
 wait1second();
                
 }
 
}

}
