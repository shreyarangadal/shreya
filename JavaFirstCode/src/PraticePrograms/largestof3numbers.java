package PraticePrograms;

import java.util.Scanner;

public class largestof3numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int a = sc.nextInt();

        System.out.println("Enter a 2nd number");
        int b = sc.nextInt();

        System.out.println("Enter a 3rd number");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" largest");
        }
        else if(b>a && b>c){
            System.out.println(b+" largest");
        }
        else
        {
            System.out.println(c+" largest");
        }
        //using ternary operator
        /*
        int largest1 = a>b?a:b;
        int largest = c>largest1?c:largest1;
*/
       //using the ternary operator by using single statement
        //int largest = c>(a>b?a:b)?c:(a>b?a:b);
        //System.out.println(largest +" is largest number");
    }
}
