package set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSwt {

public static void main(String[] args) {
      
		
		HashSet<Integer> obj=new HashSet<>();
		obj.add(1);
		obj.add(2);
		obj.add(0);
		obj.add(1); 
		obj.add(4);
		//It will not be added as 1 is already present
		//If you try to add duplicate object 
		
		System.out.println(obj);
		//clone --Copy
		//obj--hashset
		//copy hashset 
		HashSet<Object> t=(HashSet) obj.clone();
		
		System.out.println(t);
		System.out.println("Arraylist");
		
		ArrayList<Object> p =new ArrayList<>();
		p.add(1);
		p.add(2);
		p.add(0);
		p.add(1); 
		p.add("t");
		p.add(4);
		
		System.out.println(p);
		

	}


}
