package Polymorphism;

// poly means many  morphism means -> many forms
//- runtime and compile time
//method overloading and  method overiding
public class Employee {

	// without arguement
	// data types
	// order

	
	//chaining  inside mehtod we can access another method  only possible in child  -- THIS keyword
	void add(String arg, int argss) {

		System.out.println(arg + " ===  " + argss);

	}

	void add(int argss, String arg) {

		System.out.println(argss + "  " + arg);

	}

	void add() {

		this.add(23, "suresh");

		System.out.println("withoiut arguemnt");
	}

	void add(String arg, int age, Double salary) {

		System.out.println(arg + "  " + salary + " " + age);
	}

	public static void main(String[] args) {

		Employee e = new Employee(); // obje creations

		e.add();

		e.add("madhavan", 10, 40000.0);
		e.add("babu", 0);
	}
}
