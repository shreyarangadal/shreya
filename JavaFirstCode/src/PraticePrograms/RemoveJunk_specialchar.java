package PraticePrograms;
import java.util.Scanner;
public class RemoveJunk_specialchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        s= s.replaceAll("[^A-Za-z0-9]","");
        System.out.println("After removing junk or special characters String is" + s);
    }
}
