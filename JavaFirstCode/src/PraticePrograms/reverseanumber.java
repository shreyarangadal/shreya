package PraticePrograms;

import java.util.Scanner;

public class reverseanumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int org_num=num;
        System.out.println("Entered number is "+num);
        //using the algorithm

        int rev=0;
        while(num!=0){
            rev= rev*10 + num%10;
            num= num/10;
        }
 /*
        //using the string buffer class
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        //using the string builder class
        StringBuilder sb = new StringBuilder();
        sb.append(num);//append method will append our number to string builder variable
        StringBuilder rev = sb.reverse();
       */
        System.out.println("Reverse number is "+rev);
        //palindrome number or not
        if(org_num==rev)
            System.out.println(org_num +" is a Palindrome number");
        else
            System.out.println(org_num +" is not Palindrome Number");

    }

}
