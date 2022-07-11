package Collection;

import java.util.LinkedList;

public class List_Example {

	public static void main(String arg[]) {
		LinkedList<Object> obj=new LinkedList<Object>();
		obj.add(1);
		obj.add("String");
		System.out.println(obj);
        obj.addFirst("i am first ");
        obj.addLast("i am last");
        System.out.println(obj);
        obj.removeFirst();
        obj.removeLast();
        System.out.println(obj);
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
	}
}
