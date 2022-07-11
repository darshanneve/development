package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSet_Example {

	public static void main(String[] args) {
		  TreeSet<Integer> t=new TreeSet<>();
	      t.add(1);
		  t.add(5);
		  t.add(2);
		  t.add(1);
		  t.add(4);
		  t.add(8);
		  t.add(9);
		  t.add(10);
		  
		  System.out.println(t);
		  //it will return the object which greater or equal 
		  //[1,2,4,5,6,7,8,9,10]--equal will not work
		  System.out.println(t.ceiling(5));
         System.out.println(t.ceiling(6));
         System.out.println(t.ceiling(11));
     
         Iterator itr=t.descendingIterator();
         //it will create new set which is descending order 
         //then it will handover to iterator 
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
         Iterator p=t.iterator();
         while(p.hasNext()) {
        	 System.out.println(p.next());
         }
         System.out.println(t.higher(5));
        // it will return object which greater
         System.out.println(t.higher(10));
         //it will return object which grater if not element is greater than 10
         System.out.println(t.lower(5));
         //it will only check less than 
	}

}
