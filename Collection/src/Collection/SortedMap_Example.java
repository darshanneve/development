package Collection;

import java.util.TreeMap;

public class SortedMap_Example {

	public static void main(String[] args) {
		TreeMap<String, Integer> t=new TreeMap<>();
		    t.put("a", 1);
		    t.put("b", 2);
			t.put("c", 3);
			t.put("d",4);
			t.put("e", 5);
			System.out.println(t);
			System.out.println("This is print first element :" +t.firstKey());
			System.out.println("This is print Last element :" +t.lastKey());
			System.out.println("Less than object is : " +t.headMap("d"));
			System.out.println("Last Key in the map is : " +t.tailMap("b"));
			System.out.println("key in the range from : "+ t.subMap("a", "d"));
			System.out.println("the set is :"+t.keySet());
			System.out.println("This is entry set :" +t.entrySet());
			System.out.println(t.comparator());
			
		  

	}

}
