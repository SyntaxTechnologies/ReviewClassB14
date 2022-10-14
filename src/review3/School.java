package review3;

public class School {
	
	public static void main(String[] args) {
		
		Teacher t=new Teacher("John", "Smith");
		System.out.println(t.name);
		
		Teacher t1=new Teacher("Jane", "Smith", "Biology");
		t1.teach();
		
		Teacher t2=new Teacher("Jack", "Smith", 5);
		
		Teacher.school="Syntax";
		
		Teacher.work(); //public
		t2.print(); //protected
		t2.teach(); //default
		// t2.getBonus(); methodfrom the type Teacher is not visible
		
		
		/* variables syntax
		 * 
		 *    OPTIONAL        OPTIONAL            MUST     MUST
		 * accessModifier   nonAccessModifier   dataType   name
		 *     public           static            String   breed;
		 * 
		 
		 //public ->protected->default->private
		 
		 * method syntax
		 * 	   OPTIONAL           OPTIONAL          MUST       MUST
		 *  accessModifier   nonAccessModifier   returnType    name
		 *      public          static            void      printInfo
		 */
		
	}
}
