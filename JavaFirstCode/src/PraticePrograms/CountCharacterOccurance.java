package PraticePrograms;
import java.util.Scanner;
public class CountCharacterOccurance {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String s =sc.nextLine();
        int len = s.length();
        System.out.println(len);
        System.out.println("Enter the Char who's occurrence needs to checked");
        String c =sc.next();
        int len_afterremoval = s.replace(c,"").length();
        int count = len- len_afterremoval;
        System.out.println("Count of occurrence of char is :"+count);

    }
}
