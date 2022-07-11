package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Example {

	public static void main(String[] args) {
	LinkedHashSet<Integer> obj=new LinkedHashSet<>();
		  obj.add(1);
	      obj.add(2);
	      obj.add(0);
	      obj.add(1);
	      obj.add(4);
	      System.out.println(obj);//it will not be added as 1 is already [present if you to add 
	     // duplicate object
		//clone ---copy 
	      //obj--hashset 
	      //copy hashset
	      HashSet<Object>t=(HashSet) obj.clone();
	      System.out.println(t);
	      System.out.println("ArrayList");
	      ArrayList<Object>p=new ArrayList<>();
	      p.add(1);
	      p.add(2);
	      p.add("tt");
	      p.add(1);//it will not be added as 1 is already present if you to add duplicate object
	      System.out.println(p);
	      System.out.println("LinkedHashSet");
	      LinkedHashSet<Object>o=new LinkedHashSet<Object>();
	      o.add(1);
	      o.add(2);
	      o.add(o);
	      o.add(1);
	      System.out.println(o);
	}
}
