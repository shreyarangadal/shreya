package PraticePrograms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int n1 = sc.nextInt();

        System.out.println("Enter a 2nd number");
        int n2 = sc.nextInt();

        int sum=0;
        System.out.print(n1+"  "+n2);

        for(int i=2;i<10;i++){
            sum=n1+n2;
            System.out.print("  "+sum);
            n1=n2;
            n2=sum;
        }
    }
    }
