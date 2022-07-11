package Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmap_example {

	public static void main(String[] args) {
		HashMap<String, String> obj=new HashMap<String, String>();
		obj.put("one", "testing");
		obj.put(new String("one"), "test");
		System.out.println(obj);
		
		IdentityHashMap<String, String> obj1=new IdentityHashMap<>();
		obj1.put("one", "test");
		obj1.put(new String("String"),"testing" );
		System.out.println(obj1);

	}

}
