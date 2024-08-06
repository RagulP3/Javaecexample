package Day1_Encapsulation;

public class demo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.setEid(101);
		e1.setEname("Ragul");
		e1.setSalary(200000.0d);
		e1.setCity("puducherry");
		
		System.out.println(e1);
		
		Employee e2=new Employee();
		
		e2.setEid(102);
		e2.setEname("pravin");
		e2.setSalary(120000.0d);
		e2.setCity("tamilnadu");
		
		
		System.out.print(e2);

	}

	
	

	
	

}
