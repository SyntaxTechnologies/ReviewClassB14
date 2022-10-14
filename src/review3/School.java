package review3;

public class School {
	
	public static void main(String[] args) {
		
		Teacher t=new Teacher("John", "Smith");
		System.out.println(t.name);
		
		Teacher t1=new Teacher("Jane", "Smith", "Biology");
		t1.teach();
		
		Teacher t2=new Teacher("Jack", "Smith", 5);
		
		Teacher.school="Syntax";
		Teacher.work();
		
	}

}
