package PraticePrograms;
import java.util.Scanner;
public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        String org_str=str;
        System.out.println("Entered string is "+str);
        String rev="";
        int len = str.length();
        for(int i=len-1;i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse string is "+rev);

        if(org_str.equals(rev))
            System.out.println(org_str +" is a Palindrome ");
        else
            System.out.println(org_str +" is not Palindrome ");
    }
}
