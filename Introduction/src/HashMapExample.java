import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key , value
HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(0, "Hello");
hm.put(1, "Shreya");
hm.put(2, "Rangadal");
System.out.println(hm);
System.out.println(hm.get(2));
//hm.remove(2);
Set sn= hm.entrySet();
Iterator i=sn.iterator();
while(i.hasNext()) {
//System.out.println(i.next());
Map.Entry mp = (Map.Entry)i.next();
System.out.println(mp.getKey());
System.out.println(mp.getValue());
}
	}

}
