package oops2;

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bmw b = new Bmw();
		
		//method overriding means when same name & same  no'f arguments is in parent & child class
		   ///preference will be given to child method.
		
		//
		//static polymorohism
		b.start();   //when u have same method in child
		b.stop();   //inherting from parent
		b.fuel();   //inheriting from parent bcz child does not have this method
		b.theftsfety();    //this is limited to bmw only.
		
		//parent can't access child class methods
		
		car c = new car();
		c.start();
		c.stop();
		c.fuel();
		
		//dyamic polymorphism //inheritance . u can cretae a child object Bmw() & referenced by  new c1 obj refrenc.
		// u can access the common method b/t parent & child  from this new c1 obj refere 
		
		car c1 = new Bmw();
		c1.start();
		c1.stop();
		c1.fuel();
		
		
		
	}

}
