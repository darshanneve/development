package Collection;

import java.util.TreeMap;

public class NavigableMap_Example {

	public static void main(String[] args) {
		TreeMap<Integer, String> obj=new TreeMap<Integer,String>();
		    obj.put(1, "a");
			obj.put(2, "b");
			obj.put(3, "c");
			obj.put(4, "f");
			obj.put(6,"d");
			obj.put(7, "e");
			System.out.println(obj);
			System.out.println("The next greater key-value of 5 is : "+ obj.ceilingEntry(5));
			System.out.println("The next greater key of 6 is : "+ obj.ceilingKey(6));
			System.out.println(obj.descendingKeySet());
			System.out.println(obj.descendingMap());
			System.out.println("The mapping with greatest key is : "+obj.floorEntry(4));
			System.out.println("The mapping with greatest key is : "+obj.floorKey(7));
			System.out.println("View of map with key less than" + " or equal to 7 : "+obj.headMap(7, false));
           System.out.println("View of map with key less than" + " or equal to 7 : "+obj.headMap(6));
           System.out.println("next key-value is prient :"+obj.higherEntry(3));
           System.out.println("next key is prient :"+obj.higherKey(1));
           System.out.println("" +obj.lowerKey(5));//only key print
           System.out.println(""+obj.lowerEntry(6));//key_value
           System.out.println("First removed key-value from the map : "+obj.pollFirstEntry());
           System.out.println("Removed key-value associated with"+" greatest key : " +obj.pollLastEntry());
           System.out.println(obj.subMap(4, 7));
          System.out.println(obj.subMap(1, true, 3, true));
           
	}
}
