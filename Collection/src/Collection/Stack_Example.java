package Collection;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
	 Stack<String> p=new Stack<>();
	 p.push("test");
	 p.push("test1");
	 p.push("test2");
	 p.push("test3");
	 p.add("test4");
	 p.pop();//last in first out
	 System.out.println(p);

	}

}
