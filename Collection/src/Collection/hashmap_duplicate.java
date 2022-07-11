package Collection;

import java.util.HashSet;

public class hashmap_duplicate {

	public static void main(String[] args) {
	  HashSet<smapleClass> obj=new HashSet<>();
	 smapleClass p=new smapleClass();
	 obj.add(p);
	 obj.add(new smapleClass());
	 obj.add(p);
	 System.out.println(obj);//equals
	 HashSet<Integer> o=new HashSet<>();
	 o.add(1);
	 o.add(2);
	 
	 //first it will call equal method and check with remaining object 
	 //if both are different then add it 
	 o.add(1);
	 
	

	}

}
