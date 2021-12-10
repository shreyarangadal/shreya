package PraticePrograms;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class readdata_fromtextfile {
    public static void main(String[] args) throws IOException {

       /* FileReader fr=new FileReader("C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Desktop\\TestData.txt");
        BufferedReader br =new BufferedReader(fr);

        String str;
        while((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        */
        //Approach -2
        File file =new File("C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Desktop\\TestData.txt");
        Scanner sc=new Scanner(file);
        /*
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

         */

        //Approach - 3
        sc.useDelimiter("\\z");
        System.out.println(sc.next());

    }
}
