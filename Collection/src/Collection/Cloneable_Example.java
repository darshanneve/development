package Collection;

import java.util.RandomAccess;

public class Cloneable_Example {
	

	public static final char[] rollnumber = null;

	public Cloneable_Example(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	//parent is object class 
			static class Cloneable_example implements Cloneable,RandomAccess {
				public int rollnumber;
				public String name;
				public  Cloneable_example(int a,String p) {
					rollnumber=a;
					name=p;
				}
				

	public static void main(String[] args) throws CloneNotSupportedException {
		Cloneable_Example t=new Cloneable_Example(23,"ress");
		Cloneable_Example obj=(Cloneable_Example)t.clone();
		System.out.println(obj.rollnumber);
		
	
			
		
		}

	}

}
