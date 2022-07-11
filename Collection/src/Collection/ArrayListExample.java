package Collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		int[] a=new int[3];//array only support homogeneous
		a[0]=1;
		//a[1]="Str";//compilation error
		
		int b=3;
		//collection support hetrogeneous objects
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add("String");//we added string
		obj.add(b);//we added int wrapper classes int --Integer
		obj.add(45);
		obj.add(344);//(1,1344);
		//whether compiler throw any error --no 
		//because collection support hetrogeneous object 
		//collection is nothing but group of object represent as single entity 
		//if you want to retrive specific object from collection we use get method 
		System.out.println("-------------");
		System.out.println(obj.get(0));
		//if means please give object from collection which is at position 0
		System.out.println(obj.get(1));
		System.out.println(obj.get(3));
		System.out.println("-----------------------------------------------");
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        
        System.out.println(obj.equals(obj));
		System.out.println(obj.size());
		System.out.println("------------------------------");
	     System.out.println(obj.set(1, 2));
	     System.out.println(obj.indexOf(2));
	     
	     
	     
		
		//it will represent actual size of collection

	}

}
