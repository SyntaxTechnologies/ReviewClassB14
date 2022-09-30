package review1;

public class StringMethods1 {
	
	public static void main(String[] args) {
		
		String textFromApplication="  Enroll today  ";
		String textFromUserStory="Enroll today";
		
		if(textFromApplication.trim().equals(textFromUserStory)) {
			System.out.println("Text is matched.Test Pass");
		} else {
			System.out.println("Text is NOT matched.Test Failed");
		}
		
		//trim() - Returns a string whose value is this string, with any leading and trailing
	    // whitespace removed.
		
		System.out.println(textFromApplication.trim()); //"Enroll today"
		System.out.println(textFromApplication); //"  Enroll today  "
		
		//substring
		String str="Hello Class";
		String part2=str.substring(6); //Class
		System.out.println(part2);
		
		String part1=str.substring(0,5);//Hello
		System.out.println(part1);
		
		//concat
		String newString=part1.concat(" ").concat(part2);
		System.out.println(newString);
		
		System.out.println(part1+part2);

		// some examples
		char single=newString.substring(6).charAt(0);
		System.out.println(single);
		
		// newString.charAt(0).substring(6); CE
		
		//replace(); Replaces each substring of this string that matches target
			//sequence with the specified replacement sequence. 
		
		String myString="Today is September";
		myString=myString.replace("September", "October"); //replaces if find
		
		System.out.println(myString);
		
		myString=myString.replace('A', 'w'); //Does not replaces if not found
		System.out.println(myString);
		
		System.out.println("    SPLIT     ");
		
		String myStr="Today is a review class";
		
		String[] array=myStr.split(" ");
		System.out.println(array.length); //5
		System.out.println(array[3]);//review
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		//other way
		for(String arr:array) {
			System.out.println(arr);
		}
	}
}
