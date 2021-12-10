package PraticePrograms;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b= new int[a.length];
        int l=1;
        int r=a.length-1;

        ArrayList <Integer> al = new ArrayList <Integer>() ;
        al.add(a[0]);
        while(l<r) {
           al.add(a[r]);
           al.add(a[l]);

           r--;
           l++;
        }
        System.out.print(al);

    }
}
