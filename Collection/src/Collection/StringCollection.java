package Collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class StringCollection {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("first");
		obj.add("second");
		obj.add("third");//touppercase
	    //1
		System.out.println(obj);
		System.out.println(obj.get(0).toUpperCase());
		System.out.println(obj.get(1).toUpperCase());
		System.out.println(obj.get(2).toUpperCase());
	
		
		//2
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i).toUpperCase());
		//3 ---iterator
			System.out.println("------iterator-----");
		Iterator<String>itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toUpperCase());
		}
		
		//itr.next();
		//itr.next();
		// vitr.remove();
		}
	}

}
