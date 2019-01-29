
public class Temperature
    
    {

    public static void fahrToCent(float fahrenheit){
       
    float celsius;
       
    celsius=5 * (fahrenheit -32) /9; 
       
    System.out.println(fahrenheit + "F in Degrees Celsius is: " + celsius + "C");
       
    }
    
    public static void centToFahr(float celsius){
       
    float fahrenheit;
       
    fahrenheit=celsius * 9 / 5 + 32; 
       
    System.out.println(celsius + "C in Degrees Fahrenheit is: " + fahrenheit + "F");
       
    }
    
    public static void main(String[] args) {
     
    fahrToCent(212);
     
    centToFahr(100);
    
    }
    
}
    

