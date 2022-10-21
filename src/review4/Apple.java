package review4;

public class Apple extends Fruit{
	
	String size;
	String taste;
	double price;
	
	Apple(String name, String shape, String color, String size){
		super(name, shape, color);
		this.size=size;
	}
	
	Apple(String name, String shape, String color, String size,String taste, double price){
		this(name, shape, color, size);
		this.taste=taste;
		this.price=price;
	}
	
	//overloading - methods with same name within same class
	
	/*
	 * how to achieve overloading:
	 * 	1. change # of parameters
	 *  2. type of parameters
	 *  
	 *  in overloading - method signature MUST BE DIFFERENT
	 *  we do not care about return type
	 *  
	 *  method signature= name+parameters
	 */
	void makeJuice() {
		System.out.println("from "+name+" we can make "+taste+"juice");
	}
	
	/* this is not overloading -> signature is same
		String makeJuice() {
			
		}
	*/
	void makeJuice(String fruit) {
		System.out.println("We can have juice from "+name+" mixed with "+fruit);
	}
	
	
	public static void main(String[] args) {
		
		Apple app=new Apple("apple", "circle", "red", "big");
		// app.color; not visible since it acc mod is PRIVATE
		System.out.println(app.name);
		System.out.println(app.shape);
		
		System.out.println(Fruit.fresh);
		System.out.println(Apple.fresh);
		
		app.grow(); //fruit
		app.haveBenefits(); // fruit
		app.makeJuice(); //apple
	}
	

}
