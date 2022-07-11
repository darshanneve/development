package Collection;
import java.util.ArrayList;
public class ListExample {
	public static void main(String[] args) {
		ArrayList<Object> t=new ArrayList<Object>();
		t.add(1);
		t.add("Testing");
		//System.out.println(t);
	     //t.addFirst("i am first");
		System.out.println(t);
		t.add(1, "List add number");
		//System.out.println(t);
		ArrayList<Object> p=new ArrayList<>();
		p.add("check");
		p.add(10);
		
		t.addAll(p);
		System.out.println(t);
		
		ArrayList<Object> p1=new ArrayList<>();
		p1.add("Third collection ");
		p1.add(100);
		t.addAll(1,p1);
		System.out.println(t);
		
		t.remove(1);//remove index value 
		System.out.println(t);
		t.remove(Integer.valueOf(1));
		System.out.println(t);
		//below methods is from list interface which take a parameter
		//index--- if we try to delete object which is not present at respect index----out of 
		//t.remove(100);
		//below method is of collection interface
		//which take object a parameter,if present delete
		//if not return false --no exception 
		System.out.println("output" + t.remove("tt"));
		System.out.println(t);
		t.removeAll(p1);
		System.out.println(t);
		
		//list allow dublicate 
		t.add(10);
		System.out.println(t);
		
		//list --Get(int index);
		//it will allow to get the specific object based on index
		System.out.println(t.get(2));//t willcheck at last in index typr check
		
		//list --set (int,object o);
	      t.set(4, 1000); //replace 10
	      // t.add(4, 1000);
	       System.out.println(t);//array-- D S ---growable-array  /list ka part duplicate 
	       System.out.println(t.indexOf("Testing"));//secharching 0 index se suru hoga 
	       t.add("Testing");
	       System.out.println(t);
	       System.out.println(t.lastIndexOf("Testing"));//searchring last se karega 
	       t.add(null);
	       System.out.println(t);
	       
	       ArrayList j=new ArrayList(t);
	       System.out.println(j);
	       System.out.println(j.size());
	       
		//
		
	}

}
