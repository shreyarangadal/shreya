package PraticePrograms;

import java.util.HashSet;

public class duplicateelementofarray {
    public static void main(String[] args) {
        String arr[] = {"java","c","c#","sql"};
        //Approach - 1
       /* boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] ==arr[j]) {
                    System.out.println("Found Duplicate element in an array: " + arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false) {
            System.out.println("Not Found Duplicate element in an array ");
        }
        */
        //Approach - 2
        HashSet<String> hs =new HashSet<>();
        boolean flag=false;
        for(String l:arr){
            if(hs.add(l)==false){
                System.out.println("Found Duplicate element in an array "+l);
                flag=true;
            }
        }
        if(flag==false) {
            System.out.println("Not Found Duplicate element in an array ");
        }
    }
}
