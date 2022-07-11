package Collection;

import java.util.ArrayList;

public class Generic_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Object> test=new ArrayList<>();
      test.add(1);
      test.add("string");
      System.out.println(test.get(1));
      Integer t=(Integer)(test.get(0));
      System.out.println((t+20));
      //object is class which is superclass
      ArrayList<Object>p=new ArrayList<>();
      //where object is parant of double class --yes
     p.add(2.3);// by default decimal value suppoert data type double 
     //wrapper class double
     //float class object
     //whether object is parent of float class --yes
     p.add(1.2f);    //it will only support double only
     //string class object
     //whether object is parent of string class--yes
      p.add("string");
     // runtime exception handle karne ke liye generic used hota he   --
	}

}
