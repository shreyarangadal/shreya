import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> hs= new HashSet<String>();
hs.add("India");
hs.add("UK");
hs.add("AUS");
hs.add("AUS");
System.out.println(hs);
Iterator<String> i= hs.iterator();
//System.out.println(i.next());
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
