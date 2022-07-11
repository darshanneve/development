package Collection;

import java.util.HashMap;

public class Hashtable_MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> test=new HashMap<String, Integer>();
		test.put(null, 1);
		test.put("one", 1);
		System.out.println(test);
		HashMap<String, Integer> p=new HashMap<String, Integer>();
		p.put(null, 1);
		System.out.println(p);
		
		

	}

}
