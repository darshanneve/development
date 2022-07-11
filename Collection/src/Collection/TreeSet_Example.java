package Collection;
import java.util.TreeSet;
public class TreeSet_Example {

	public static void main(String[] args) {
	  TreeSet<Integer> t=new TreeSet<>();
      t.add(1);
	  t.add(5);
	  t.add(0);
	  t.add(10);
	  t.add(1);
	  t.add(4);
	  t.add(2);//doublicate is not allow----ascending order
	  t.add(3);
	  System.out.println(t);

	}

}
