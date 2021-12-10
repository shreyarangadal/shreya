package part1;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class hackerrank {

    public static void main(String[] args) {
     /*   int x = 3, y = 2, z = 2;
        int iter = 0;
        for (int i = 0; i <= (z - x); i++) {
            if (x == z) {
                iter += 1;
            } else {
                iter++;
            }
            System.out.println(iter);

int a[]={1,2,3,4,5,5,6};int count=1;int num=0;
            for(int i=0; i<a.length; i++)
            {
                for(int j=i+1; j<a.length; j++)
                {
                    if(a[i] == a[j])
                    {
                        count++;
                        num = a[i];
                    }
                }
            }
            System.out.println(num +" "+count);*/

        List<Integer> list = Arrays.asList(1,2,3,4,5,5,6);

        Set<Integer> set = new HashSet<Integer>(list);
        for(Integer r:set){
            System.out.println(r +": "+ Collections.frequency(list,r));
        }
        }
        }