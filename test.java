package linkedlists;

class Employee1{
	String name;
	int age;
	float sal;
	public Employee1(String name, int age, float sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public void printData()
	{
		System.out.println("Emp name :"+name);
		System.out.println("Emp age :"+age);
		System.out.println("Emp sal :"+sal);
	}
	public void incrementSal(int increment) {
		sal=sal+sal*increment/100;
		
	}
}



public class EMPDEMO1 {
	

	public static void main(String[] args) {
      Employee1 e1=new Employee1("ABC",24,20000.50f);
      e1.printData();
      e1.incrementSal(5);
      e1.printData();
 
	}

}
