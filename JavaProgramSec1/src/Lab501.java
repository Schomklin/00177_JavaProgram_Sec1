
public class Lab501 {
	public static void main(String[] args) {
		// String format
		System.out.println(formatNumber(500)); //call formatNumber method
		System.out.println(formatNumber('a'));
		System.out.println(formatNumber(89.9934));
		String strNum = formatNumber("550");
		System.out.println(strNum);
	}
	
	//Overloading method
	private static String formatNumber(int value) {
		return String.format("%d",value);		
	}
	
	private static String formatNumber(double value) {
		return String.format("%.3f", value);
	}	
	
	private static String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}

}
