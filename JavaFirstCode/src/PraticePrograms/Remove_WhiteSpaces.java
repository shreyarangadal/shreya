package PraticePrograms;
import java.util.Scanner;
public class Remove_WhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("Before removing white spaces the String is "+s);
        s= s.replaceAll("\\s","");
        System.out.println("After removing white spaces the String is "+s);
    }
}
