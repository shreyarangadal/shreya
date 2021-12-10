package part1;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class println {
    private static final  Scanner sc = new Scanner(System.in);
    public static void main (String [] args) {
        int n = sc.nextInt();
        //sc.skip("\r\n67");
    System.out.print("hi");
    System.out.println("hello world");
int x=3,y=5,z=10;
        System.out.println(++z+y-y+z+x++);

        String words = "Shreya";
        System.out.println(words.length());
        System.out.println(words.charAt(2));
        System.out.println(n);
        int a=0,b=2,c=8;
        a+=Math.pow(3,b);
        System.out.println(a);
int month=10,day=30,year=2021;
        Calendar cal = Calendar.getInstance();
     cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
String st = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.US).toUpperCase();
        System.out.println(st);

        //double payment  = sc.nextDouble();
        Locale indiaLocale = new Locale("en","IN");
        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        //System.out.println("US" + US.format(payment));
        String A = sc.next();
        String B =  sc.next();
        if(A.compareTo(B)>0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        A=A.substring(0,2).toUpperCase()+A.substring(1);
        B=B.substring(0,2).toUpperCase()+B.substring(1);
        String C=A.substring(1);
        System.out.println(A+" "+B+"   "+C);
    }
}
