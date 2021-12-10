package PraticePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class new1 {
    public static void main(String [] args) {
        /*String str = "wwxxazzyyduh";
        char [] c = str.toCharArray();
        //int k = 0;
        for(int i=0;i<c.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c[j] + " ");
            }
            System.out.println();
        }*/
        String [] arr={"test","auto","sapiens","abcd"};
        ArrayList<String> ls = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        for(int j=0;j<arr.length;j++){
            String str = arr[j];
          if(str.equalsIgnoreCase(s)){
                String revstr ="";
                int len = s.length()-1;
                for(int i=len;i>=0;i--){
                    revstr = revstr + s.charAt(i);
                }
                System.out.println(revstr);
                ls.add(revstr);
            }
            else
            {
                ls.add(arr[j]);
            }
        }
        System.out.println(ls);
    }


}
