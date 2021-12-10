package PraticePrograms;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
       int a[]={1,2,5,0};
        System.out.println("Array before sorting : " + Arrays.toString(a));
        int n=a.length;
        //n-1 iteration needs to be done
        for(int i=1;i<n;i++){
           // System.out.print(i);
            for(int j=0;j<n-1;j++){
                System.out.print(j);
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting : " + Arrays.toString(a));
    }
}
