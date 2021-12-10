package PraticePrograms;

import java.util.Arrays;

public class MissingNumberArray {
    public static void main(String[] args){
        //array should not have duplicates
        //array no need to be sorted order
        //values should be in range

        int a[]={1,2,3,5,6,7};
        int sum1=0,sum2=0;
        for(int i=0;i< a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("Sum of elements of array "+sum1);

        for(int i=1;i<=7;i++){
            sum2=sum2+i;
        }
        System.out.println("Sum of elements of array "+sum2);

        System.out.println("Missing elements of array "+(sum2-sum1));
    }
}
