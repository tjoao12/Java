
public class NumberConverter {
	
	String One[]= {".", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten", "eleven", "twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eightteen", "nineteen"};
	String Two[]= {".",",", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	
	public void DigitsToWords(int No) {
		String Answer= " ";
	
		if (No>=1000) {
			Answer += One [No/1000] + " Thousand ";
			No -= (No/1000*1000);
		} 
		if (No>=100) {
			Answer += One[No/100] + " Hundred ";
			No -= (No/100*100);
		}
		if (No>=20) {
			Answer += Two[No/10] + " ";
			No -= (No/10*10);
		}
		if (No<20) {
			Answer += One[No];
		}
		System.out.println(Answer);
	}

	public static void main(String r[]) {
		NumberConverter convert = new NumberConverter();
		convert.DigitsToWords(1078);
		}
}
