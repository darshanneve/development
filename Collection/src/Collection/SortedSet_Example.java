package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Example {

	public static void main(String[] args) {
    SortedSet<Integer> obj=new TreeSet<Integer>();
      obj.add(1);
	  obj.add(5);
	  obj.add(0);
	  obj.add(10);
	  obj.add(1);
	  obj.add(4);
	  obj.add(2);
	  obj.add(3);
	  System.out.println(obj);
      System.out.println("First Object "+obj.first());
      System.out.println("Last Object  "+obj.last());
      //it will return the object which are less than 5
      System.out.println(obj.headSet(5));
      //it will create new set which are greater than 5 or equal to 5
      System.out.println(obj.tailSet(5));
      //it will create new set where object are --4 and less than 9
      System.out.println(obj.subSet(4, 9));
     
	}

}
