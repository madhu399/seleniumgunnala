
public class string {

	public static void main(String[] args) {
	
		
		String s = "123java456";
		
		String output ="";
		for (int i= 0;i<s.length();i++) {
			
			if(!Character.isDigit(s.charAt(i))) {
				output=output+s.charAt(i);
			}
		}
		System.out.println(output);
		
		Character.isDigit(s.charAt(0));
		System.out.println(Character.isDigit(s.charAt(0)));

	}

}
