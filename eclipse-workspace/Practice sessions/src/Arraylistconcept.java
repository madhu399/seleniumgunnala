import java.util.ArrayList;

public class Arraylistconcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
          
		//Arraylist ---Dynamic array
		//1.can contain duplicate values
		//2.Can add & remove values at any time.
		//3.can search for any values by index .get method.
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(200);
		ar.add("madhavi");
		ar.add("best boy");
		
		System.out.println(ar.size());
		ar.add(12.20);
		
		ar.remove(1);//removes 2nd value i.e 200
		
		ar.set(0, "element"); //updating o index value . 10   to element.
		
		ar.set(0, "bhuvan");
		
		ar.set(1, 500);
		
		System.out.println(ar.subList(0, 3));
		
		
		System.out.println(ar.size());
		
		//System.out.println(ar.get(4));
		
		//to print all values in arraylist use for loop
		
		for(int i=0; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}
		
	            //Generic & non - generics// generics means data types
		 
		ArrayList ar1 = new ArrayList();
		
		                            //ar1.add(10); //u can't store int values in ar1 bcz its data type is string.
		 ar1.add("tett");
		 ar1.add("hari");

		 ar1.addAll(ar);   // merges ar values to ar1 array. now ar1 will have values from ar
		 
			System.out.println(ar1.size());
			
			for(int i=0; i<ar1.size(); i++) {
				
				System.out.println(ar1.get(i));
			}
			
			
				
			//to store any data type use E as datatype

			ArrayList<E> ar2 = new ArrayList<E>();		
			
			
	}

}
