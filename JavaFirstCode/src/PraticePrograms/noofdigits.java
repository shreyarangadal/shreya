package PraticePrograms;
import java.util.Scanner;
public class noofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int org_num = num;
        System.out.println("Entered number is " + num);
        int rev = 0,count=0;
        while (num != 0) {
            num = num / 10;
            System.out.println("number is " + num);
            count++;
        }
        System.out.println("Entered number digits is " + count);
    }
}
