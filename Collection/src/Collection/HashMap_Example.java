package Collection;

import java.util.HashMap;

public class HashMap_Example {

	public static void main(String[] args) {
	  HashMap<String,Integer>obj=new HashMap<>();
	    obj.put("a", 1);
		obj.put("b", 2);
		obj.put("c", 3);
		obj.put("d",4);
		obj.put("e", 5);
		obj.putIfAbsent("h", 1);//you add below objects if key e is not present already
		System.out.println(obj);
		obj.remove("e");//it will remove object from map
		obj.remove("p");//it key is not present it will no do anything 
		obj.remove("h", 5);//this remove takes two parameter key and another is value 
		//first it will check whether we have key as h 
		//second if key is present then whether it has value 5
		//if value or key is not then it will not delete
		System.out.println("h is not getting remove");
		obj.remove("h",1);//key and value is matching so removing
		System.out.println(obj);
		System.out.println("h is getting remove ");
		HashMap<String,Integer>obj1=new HashMap<String, Integer>();
		obj1.put("f", 5);
		obj1.putAll(obj);
		System.out.println(obj1);
	
}
}