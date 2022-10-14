package review3;

public class Peru extends Country {
	
	double salary;
	
	Peru(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		Peru peru=new Peru("Peru");
		peru.name="Peru";
		peru.capital="Lima";
		peru.population=22000000;
		peru.salary=1000;
		
		
		//peru.president - private
	}
}

