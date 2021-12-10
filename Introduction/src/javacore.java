
public class javacore {

	public static void main(String[] args) {		
		String a =" javatraining";
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("t"));
		System.out.println(a.indexOf("a"));
		System.out.println(a.substring(3,6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("string classes"));
		System.out.println(a.trim());//this removes white spaces only at the beginning and at the end of the string
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());
		String arr[] = a.split("t");//split
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("a", "$"));
		String b="madam";
		String t="";
		for (int i=b.length()-1;i>=0;i--) {
			t=t+b.charAt(i);
		}
		System.out.println(t);
		
		if(b==t) {
			System.out.print("it's palindrome!");
		}
		
		
		int j=20;
		do {
			System.out.println(j);
			j++;
		}while(j>30);
		/*int k=1;
		for(int i=1;i<5;i++) {
			//System.out.println("outer loop started");
			for(int z=1;z<=5-i;z++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
			
		}*/
		/*int k=1;
		for(int i=1;i<5;i++) {
			for(int z=1;z<=i;z++) {
				System.out.print(z);
				System.out.print("\t");
				
			}
			System.out.println(""); 
		}*/
		
		int k=3;
		for(int i=3;i<10;i=i+3) {
			for(int z=3;z<=i;z=z+3) {
				System.out.print(k);
				System.out.print("\t"); 
				k=k+3;
			}
			System.out.println(""); 
		}
		
		
	}

}
