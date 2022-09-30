package review1;

public class Questions {
	
	public static void main(String[] args) {
		
		// how would you reverse a String without using reverse function?
		
		/* 1. use StringBuilder and reverse method
		 * 2. use charAt();
		 * 3. use toCharArray(); -. HW
		 */
		
		String str="hello";
		String newString="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			newString=newString+str.charAt(i);
		}
		
		String s="Class is almost over";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		
		System.out.println(sb);
		
	}
}
