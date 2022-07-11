package Collection;

import java.util.Stack;
import java.util.Vector;

public class vector_example {
	         public static void main(String[] args) {
			// Create vector collection
			Vector<String> obj=new Vector<>();
				
				//using addelement method of vector class to add object
				obj.addElement("String");
				System.out.println(obj);
				// Create stack collection
				Stack<String> obj1=new Stack<String>();
				//using push method of stack class to add object
				obj1.push("TEsting"); //collection add 
				obj1.push("second");
				obj1.add("Three");
				
				
				//Either we print all the elements 
				System.out.println(obj1);
				obj1.pop(); //delete 
				//We access specific object/elements 
				System.out.println(obj1.get(1));
				System.out.println(obj1);
				obj.addAll(obj1);
				System.out.println(obj);
				
				//
				
		}

	}

