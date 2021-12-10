package part1;

import java.util.Scanner;

public class ClassDema {
    public int add (int a,int b){
        return a+b;
    }
    public int add (int c, int d, int e){
        return c+d;
    }
    public static void main (String [] args){
        Student student = new Student(1);
        System.out.println(student);
        System.out.println(student.getId());

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first no");
        int a = scan.nextInt();

        System.out.println("enter second number");
        int b = scan.nextInt();
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
    }

    test3 t = new test3() {
       // @Override
       // public void color() {

       // }
    };
}
