package Collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMap_example {

	public static void main(String[] args) throws InterruptedException {
	 WeakHashMap<String,String> t=new WeakHashMap<>();
	 String p=new String("test");
	 String j="testing";
	 t.put(p, "object one");
	 t.put(j, "object two");
	 System.out.println(t);
	 p=null;
	System.gc();
	Thread.sleep(3000);
	
	System.out.println("-------------HashMap-------------");
	HashMap<String, String> t1=new HashMap<String, String>();
	String p1=new String("test");
	String j1="testing";
	t1.put(p1,"object one");
	t1.put(j1, "object two");
	System.out.println(t1);
	p1=null;
	System.gc();
	Thread.sleep(3000);
	

	}

}
