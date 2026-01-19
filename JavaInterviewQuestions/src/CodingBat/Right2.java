package CodingBat;

public class Right2 {

	public static void main(String[] args) {
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));

	}
	
	public static String right2(String str) {
		if(str.length()<=2)
		{
			return str;
		}
		String trimmed = str.substring(0,str.length()-2);
		String remaining = str.substring(str.length()-2);
		return remaining + trimmed;
		  
	}

}
