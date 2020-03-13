package oops2;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Hashtableconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Hashtable ht = new Hashtable();	
	
	  //its similar to hashmap but its synchronized & 32 bit size hash code will be created in memory.
	  // it stores value in (key,value) type.
	  //you can do cloneing. & same hashcode will be given to coneed object. ...its a diff object ti get values from clone object.
	//   it doesn't have null values /key.
	 // unique values only & key
	
	
	   ht.put( "a","100");
	   ht.put( "b","200");
	   ht.put( "c","madhavi");
	   ht.put( "1","srithan");
	   ht.put("d","hari");
	 
	//ht.put("1","") ///null not accpeted 
	
	         System.out.println(ht.size());
	         System.out.println(ht.values());
	         System.out.println(ht.entrySet());
	          System.out.println(ht.keySet());
	          System.out.println(ht.hashCode());
	
	//cloning
	
	     Hashtable<String, String> ht1 = new Hashtable<String, String>();	
	
	     ht1 = (Hashtable)ht.clone(); 
	     
	     System.out.println("values from ht "+ ht);
	     System.out.println("values from ht1 "+ ht1);
	     System.out.println(ht1.hashCode());
	
	   ///contains value method.
	     
	     if (ht.containsValue("madhavi"))
	    	 System.out.println("ht has value madhavi") ;
	     
	     if (ht.contains("srithan"))
	    	 System.out.println("ht has value srithan");
	     
	     if (ht.containsKey("d"))
	    	 System.out.println("ht has key d");
	    	 else 
	    		 System.out.println("ht does not have key d"); 
	     
	     if (ht.equals(ht1))
	    	 System.out.println("ht & ht1 has same values") ;
	     
	     ht.clear(); ///deletes all values only in this nhashtable noy in cloned object.. 
	     
	     //print all values from hashtable using Enumeration....elements(); 
	     
	        Enumeration e  = ht1.elements();
	        System.out.println("print values from ht1 using e");
	        
	        while (e.hasMoreElements()) {
	        	System.out.println(e.nextElement());
	        }
	     
	     //getting values from entryset  using Set java util...
	        
	        Set s = ht1.entrySet();
	     
	      System.out.println(s);
	      
	     ht1.put("e","bhuvan");
	     System.out.println(ht1.values());
	     
		
	}
		
}


