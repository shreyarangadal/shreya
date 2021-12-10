package PraticePrograms;
import java.util.Scanner;
public class Count_words_in_string {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String s =sc.nextLine();
        int len = s.length();
        System.out.println(len);
        if(len>0) {
            int count = 1;
            for (int i = 0; i < len - 1; i++) {
                if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                    count++;
                }
            }
            System.out.println("No of words in a string is :"+count);
        }
        else {
            System.out.println("not a valid string");
        }
    }
}
