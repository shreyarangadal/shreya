package PraticePrograms;

import java.util.Arrays;

public class BinarySort{
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9,10}; //should be in sorted order
        int key=8;
        int l=0;
        int h=a.length-1;
        boolean flag = false;
        //approach -1
        /*
        while (l<=h){
            int mid = (l+h)/2;

            if(a[mid]==key){
                System.out.println("Element Found ...at "+a[mid]+"th position");
                flag=true;
                break;
            }
           if(a[mid]<key){
                l=mid+1;
            }
            if(a[mid]>key){
                h=mid-1;
            }
        }
        if(flag==false) {
            System.out.println("Not Found element in an array ");
        }
         */
        //Approach 2
        System.out.println(Arrays.binarySearch(a,key));

    }
}
