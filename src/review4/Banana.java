package review4;

public class Banana extends Fruit{
	
	String origin;
	
	Banana(String name, String shape, String color, String origin){
		super(name, shape, color);
		this.origin=origin;
	}
	
	/* when child class have same method name as super class -
	 * overriding - 2 methods with same name BUT inside Different classes
	 */
	
	/* how to override
	 * 
	 * 1. method signature MUST be same
	 * 2. return type MUST BE SAME
	 * 3. access modifier/visibility MUST be same or MUST be higher
	 * 
	 */
	
	protected void grow() {
		System.out.println(name+" grows fast and fresh");
	}
	
	// when child class have same static method as parent class
	// we are not achieving overriding.
	// this calls method hiding
	
	public static void havePeel() {
		System.out.println("banana is very easy to peel");
	}
	
	void makeSmothie() {
		System.out.println("from "+name+" we get tasty smoothie");
	}
	
	void makePie() {
		System.out.println("Banana pie is delicious");
	}

	public static void main(String[] args) {
		
		Banana ban=new Banana("banana", "banana shape", "yellow", "Ecuador");
		ban.haveBenefits(); //fruit
		ban.makeSmothie(); //banana
		ban.grow(); //banana
		Banana.havePeel();//banana
		
		System.out.println("      ----------------------------------    ");
	
		Fruit fruit=new Banana("banana", "banana shape", "green", "Africa");
		fruit.grow(); // runtime polymorphism
		fruit.haveBenefits();
		
		Fruit.havePeel(); //fruit
		Banana.havePeel(); //banana
	}
}
