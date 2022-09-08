package quiz;

public class MainEntry {
	public static void main(String[] args) {
		String str = "abcDEFGHeijwEIMPYmnqr";
		String result = "";
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				result += String.valueOf(ch).toUpperCase();
			}
			else if (str.charAt(i) <= 90 && str.charAt(i) >= 65) {
				result += String.valueOf(ch).toLowerCase();
			} else {
				result += ch;
			}
		}
		
		System.out.println(result);
	}
	
	
	
}
