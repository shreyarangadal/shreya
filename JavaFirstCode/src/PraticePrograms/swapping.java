package PraticePrograms;

public class swapping {
    public static void main(String[] args) {
        //using third variable
        int a = 10;
        int b = 20;
        System.out.println("Before swapping " + a + " " + b);
        int t =a;
        a=b;
        b=t;
        System.out.println("After swapping " + a + " " + b);
        //using + and / operator
        int c = 0;
        int d = 10;
        System.out.println("Before swapping " + c + " " + d);
        c=c+d; //10+20=30
        d=c-d; //30-20=10
        c=c-d; //30-10=20
        System.out.println("After swapping " + c + " " + d);
        //using * and / operator
        int e = 2;
        int f = 13;
        System.out.println("Before swapping " + e + " " + f);
//        e=e*f; //10*20=200
//        f=e/f; //200/20=10
//        e=e/f; //200/10=20
        //OR using the bitwise XOR operator
//        e=e^f;
//        f=e^f;
//        e=e^f;
        //swapping the number using the single statement
        f=(e+f)-(e=f);
        System.out.println("After swapping " + e + " " + f);
    }
}