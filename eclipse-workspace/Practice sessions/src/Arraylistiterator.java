import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<String> ar3 = new ArrayList<String>();
		
		ar3.add("test1");
		ar3.add("dhjgfhj");

		ar3.add("testselenium");
		ar3.add("work hard");
		
		Iterator<String> it = ar3.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		
		///the below  arraylist is connected with user created Employee class.
		//keeping Employee object/method in arraylist ar2.
		
		//assigning values to e1 ,e2,e3,e4
		
				//Employee e3 = new Employee(3,"sri",25);
				//Employee e4 = new Employee(4,"hari",30);
				//Employee e5 = new Employee(5,"hari",30);//
		
		Employee e1 = new Employee(1,"madhvai",40);
     	Employee e2 = new Employee(2,"bhuvan",45);
		
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		   
				
		//assigning Employee values to ar2 arraylist. 
		
		ar2.add(e1);
		ar2.add(e2);
		
		//ar2.add(e3);
		
		//ar2.add(e5);
		
		//System.out.println(ar2.size());
		
		//printing ar2 arraylist values.
		
		        
		Iterator<Employee> it1 =  ar2.iterator();
		while (it1.hasNext()) {
			Employee emp =it1.next();
			
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.id);
		}
		
		  
		
		
			}
		 

	}


