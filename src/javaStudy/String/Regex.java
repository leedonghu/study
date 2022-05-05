package javaStudy.String;

public class Regex {
	public static String solution(String id) {
		String s1 = id.toLowerCase();
		StringBuilder sb = new StringBuilder();
		String s2 = s1.replaceAll("[^a-z0-9-_.]", "");
		String s3 = s2.replaceAll("[.]{2,}", ".");
		String s4 = s3.replaceAll("^[.]|[.]$", "");
		
		if(s4.equals("")) {
			s4+= "a";
		}
		
		if(s4.length() >= 16) {
			s4 = s4.substring(0, 15);
			s4.replaceAll("[.]$", "");
		}
		
		if(s4.length() <= 2) {
			while(s4.length() <3) {
				
				s4 += s4.substring(s4.length()-1);
			}
		}
		
		
		return s4;
	}
	
	public static void main(String[] args) {
		String id = "z-+.^.";
		System.out.println(solution(id));
	}
}
