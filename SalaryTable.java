public class SalaryTable3 {

public static void columnhead(){
        
System.out.println("Annual Monthly Weekly");
    }
    
    public static void underline()
    
    {
        
      System.out.println("______________________");
    
    }
    
   
    public static void calcAndDisplayRow (int annualSalary)
    
    {
        
      int perMonth = annualSalary/12;
        
      int perWeek = annualSalary/52;
        
      System.out.println(annualSalary+ "    "+perMonth+"    "+perWeek);
        underline();
    
    }
    
    public static void main(String[] args) 
    
    {
       underline();
       
       columnhead();
       
       underline();
       
       calcAndDisplayRow(10000);
       
       calcAndDisplayRow(12500);
       
       calcAndDisplayRow(16000);
       
       calcAndDisplayRow(20000);
    }
    
}
