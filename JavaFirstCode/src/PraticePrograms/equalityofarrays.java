package PraticePrograms;

import java.util.Arrays;

public class equalityofarrays{
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 2, -1};
        int b[] = {1, 2, 1, 2, -1};
        //Approach -1 : using the inbuilt function
        //boolean status = Arrays.equals(a,b);
        /*if(status==true){
            System.out.println("arrays are equal");
        }
        else
        {
            System.out.println("arrays are not equal");
        }
        */
        //approach-2
        boolean status= true;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    status=false;
                }
            }
        }
        else{
            status=false;
        }

        if(status==true){
            System.out.println("arrays are equal");
        }
        else
        {
            System.out.println("arrays are not equal");
        }
    }
}
