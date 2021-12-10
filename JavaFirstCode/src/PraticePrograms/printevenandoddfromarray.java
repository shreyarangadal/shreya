package PraticePrograms;
import java.util.Arrays;
public class printevenandoddfromarray {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 2, 9};
        System.out.println("Even Number Array..........");
       /* for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                System.out.print(a[i]+"  ");
        }*/
        for(int value:a){
            if(value%2==0)
                System.out.print(value+"  ");
        }
        System.out.println();
        System.out.println("Odd Number Array............");
        /*for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
                System.out.print(a[i]+"  ");
        }*/
        for(int value:a){
            if(value%2!=0)
                System.out.print(value+"  ");
        }
    }
}
