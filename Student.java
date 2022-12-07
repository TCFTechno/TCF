package Polymorphism;

public class Student extends Teacher {

	
	// super -> to access the parent clas property 
	// this  -> to access the child class property
	
	// extends   
	void add()
	{
		//super.add();
		System.out.println("Student method add");
	}


	
	public static void main(String[] args) {
		
		
		Student s=new Student();
		s.add();

		Teacher s1=new Teacher();
	
	s1.add();
	}
}
