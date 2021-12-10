package PraticePrograms;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num = sc.nextInt();
        long factorial =1;
       // for(int i=1;i<=num;i++) {
       //     factorial = factorial * i;  //1,2,3
      //  }
        for(int i=num;i>=1;i--){
            //3*1=3
            //2*3=6
            //1*6=6
            factorial = (factorial * i);   //1,2,3
            System.out.println(factorial);
        }
        System.out.println(" factorial value of "+num+" is "+factorial);
   }
}
