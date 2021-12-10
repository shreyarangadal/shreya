package PraticePrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;

//WAP to count the occurences of each word in a text file
public class Amadeus {

//Java programming language language.
//    language -2
    //java -1
//    programming -1
  public static void main(String [] args) throws FileNotFoundException {

      FileReader fs = new FileReader("c:\\text.txt");
      BufferedReader br = new BufferedReader(fs);
      Iterator i = br.lines().iterator();
      //while(i.hasNext()){
        String s = (String) i.next();
        String [] str =s.split(" ");
        int j=0;
       HashMap <Integer,String> hs = new HashMap<Integer,String>();
      while(i.hasNext()){
          int count=1;
        if(str[j].contains((CharSequence) i.next())){

            count++;
        }
        hs.put(count,str[j]);
        //System.out.println(str[j] +"count is " +count);
        j++;
     }
      System.out.println(hs);
  }
}
