package day5.HWmethods;

public class HW5_1 {

	public static void main(String[] args) {
		String str = "word";
		int digit1 =100;
		double digit2 = 6.578;
		String newString = concat (str, digit1, digit2);
		System.out.println(newString);
	
	}
	
	static String concat (String strParam, int integerParam, double doubleParam) {
		String result = strParam + integerParam + doubleParam;
		return result;
	}
	

}
