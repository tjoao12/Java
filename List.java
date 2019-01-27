import java.util.*;

public class List {
  
  
  public static void main(String args []) {
    Scanner sc = new Scanner(System.in);
    
    
    int previousNumber=0;
    int sum = 0;
    int largest=0;
    
    while (previousNumber!=-9999){
           
           while (previousNumber!=-9999){
           System.out.println("Enter a whole number");  
    
           previousNumber=sc.nextInt();
           
           if (previousNumber<1 |previousNumber>100){
           System.out.println("Number is invalid and will not be added to the sum");
               }
           else {
             sum+=previousNumber;
             
             if (previousNumber>largest) {
               largest=previousNumber;
               
             }
             
              if (previousNumber==-9999){
               System.out.println("Sum of input: 3" + sum);
              }
                  
             }
    System.out.println("The largest number entered was " + largest);
  }
}
}
}
  