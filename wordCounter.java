import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class wordCounter{
  
    public static void main(String args[]) {
      
    System.out.println("Write your sentence please:");// Prints out the first instruction.
    Scanner scan = new Scanner(System.in); //Object initialisation.
    String input=" ";//Declaration for letters(String) characters.
    int counter = 0;
    double sum = 0;

    while((input=scan.nextLine())!=null) { //Scanner instruction, get a input from the key board.
    if (input.equals("end")) {//What must be typed to end the program.
      
      break;
    
    } else {     
    String[] tokens = input.split(" ");// Splits the words.

    Map<Integer,Integer> tokensLength = new HashMap<Integer,Integer>();
    for (int i = 0; i < tokens.length; i++) {//This line of code checks for what must be true to carry on.
    
    input = input.replaceAll("[\\W]", " ");//Punctuation is ignored.
    int length = tokens[i].length();
    
    if(tokensLength.containsKey(length)){    

      tokensLength.put(length, tokensLength.get(length) + 1);//If word length is equals to other words length, amount of words is added. 
    }
    else 
    tokensLength.put(length, 1);//If length of word is not equal add to a different length.

    double amountChar = tokens[i].length();
    sum = amountChar + sum;
    counter++;
    }
    double average = 0;
    if (counter > 0) {
    average = sum / counter;//Sum of total characters of all tokens is divided by number of tokens
    
    System.out.println("You have typed the sentence: " + input);//Prints out what you have typed.
    System.out.println("The number of words is: " + tokens.length);//Prints out the number of words you have typed.
    System.out.println("The word frequency of the sentence is " + tokensLength);//Prints out the results.
    System.out.println("The mean word length of the sentence is " + average);//Prints out the mean word length of the sentence.
    System.out.println("To quit the program type the 'end'");//Instruction on how to stop the program.
    }
    }
    }//End of scanner instruction
    }//End of main
}//End of class
