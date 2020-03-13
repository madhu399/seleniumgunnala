package oops2;

import java.util.HashMap;
import java.util.Map.Entry;



public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Hashmap is a class implements map interface
		//extends Abstractmap.
		//it contains only unique elements.
		//stores values in key ,value style.
		//it ,ay have one null key & multiple null values.
		//it maintains no order.
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"100_madhavi");
		hm.put(2,"200");
		
		
		System.out.println(hm.entrySet());
	
		for (Entry m : hm.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
			
		
					
		}
			
		
	}

}
