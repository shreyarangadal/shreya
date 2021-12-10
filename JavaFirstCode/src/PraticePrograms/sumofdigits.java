package PraticePrograms;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Entered number is " + num);
        int rem = 0,sum=0;
        while (num != 0) {
            rem = num %10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(" count is  " + sum);

    }
}
