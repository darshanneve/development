package set;

import java.util.LinkedHashSet;

public class linkhashset {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> obj=new LinkedHashSet<>();
		obj.add(1);  //no duplicates but insertion order is preserve
		obj.add(2);
		obj.add(0);
		obj.add(1); 
		obj.add(4);

		System.out.println(obj);
		
	}

}
