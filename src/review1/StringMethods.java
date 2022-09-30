package review1;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str="hello";
		//toUpperCase or toLowerCase
		str.toUpperCase();
		System.out.println(str); //hello
		
		System.out.println("  ---------  ");
		
		str=str.toUpperCase();
		System.out.println(str);//HELLO
		
		//length() -> Returns the length of this string.
		int size=str.length();
		System.out.println(size);
		
		//chartAt() -> Returns the char value at the specified index
		char letter=str.charAt(0);
		System.out.println(letter); //H
		
		//how to get last Character
		char lastCharacter=str.charAt(str.length()-1);
		System.out.println(lastCharacter); //O
		
		// indexOf - Returns the index within this string of the first occurrence of the specified character.
		int index=str.indexOf(lastCharacter);
		System.out.println(index); //4
		
		System.out.println(str.indexOf('e')); //-1
		System.out.println(str);
		
		//isEmpty() - returns true if length is more than 0
		boolean empty=str.isEmpty();
		System.out.println(empty);
	}
}
