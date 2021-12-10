import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a = new ArrayList<String>();
a.add("Shreya");
a.add("Asit");
System.out.println(a);
a.add(0, "Rangadal");
System.out.println(a);
//a.remove(0);
//a.remove("Asit");
System.out.println(a.get(2));
System.out.println(a.indexOf("Shreya"));
System.out.println(a.isEmpty());
System.out.println(a.set(0, "student"));
System.out.println(a.size());

	}

}
