package PraticePrograms;

import java.util.Scanner;

public class Primeornot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num = sc.nextInt();

        int count=0;
        if(num>1){
            for(int i=1;i<=num;i++){
                System.out.println(num%i);
                if(num%i==0)
                    count++;
                }
            System.out.println(count+" count");
            if(count>2)
            {
                System.out.println(num+" Not a Prime number");
            }
            else{
                System.out.println(num+" prime number");
            }
        }
        else{
            System.out.println(num+" Not a prime number");
        }

    }
}
