package oops2;

public class Employee {

		 
	int id;
	String name;
	int age;
	
	Employee(int id,String name,int age){
		this.name = name;// can use this constructor / method to call when global & local variable r same.
		this.id = id;
		this.age = age;
	}
	
}
