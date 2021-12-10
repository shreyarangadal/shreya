package PraticePrograms;

import java.util.Scanner;

public class countevenorodd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
    int num = sc.nextInt();
        System.out.println("Entered number is " + num);
    int rem = 0,even_count=0,odd_count=0;
        while (num != 0) {
        rem = num %10;
        if(rem%2==0){
            even_count++;
        }
        else{
            odd_count++;
        }
        num=num/10;
        System.out.println("number is " + num);
        }
        System.out.println("Even count is  " + even_count);
        System.out.println("odd count is  " + odd_count);
}
}
