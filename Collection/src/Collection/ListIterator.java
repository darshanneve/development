package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.sun.xml.internal.bind.v2.runtime.Name;
public class ListIterator {

	public static void main(String[] args) {
		List<String>t=new LinkedList<>();
	    t.add("Darshan");
		t.add("Suhas");
		t.add("Neve");
		
		java.util.ListIterator<String>	listIteratorobj=  t.listIterator();
		  while(listIteratorobj.hasNext()) {
			  System.out.println(listIteratorobj.next());}

			  System.out.println("---hhhhh------");
		  
		  while(listIteratorobj.hasPrevious()) {
			  System.out.println(listIteratorobj.previous());
		  }
		

	}

}
