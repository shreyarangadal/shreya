import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class test {
    public static void main(String[] args){

        String a1;
        int a =123;
        int b = 4;
        a1="abc";
        System.out.println(a1+a+b);
/*
        System.out.println(15+(4*12/6)-3);
        int num=2;
        for(int i=1;i<=10;i++){
            System.out.println(num +"*"+i+"="+(num*i));
            */
            int j=5;
            System.out.println(+j);//5
            System.out.println(j++);//6
            System.out.println(++j);//7
       // }
        int[] a4= new int[3];
        a4[0]=1;
        a4[1]=2;
        a4[2]=3;
        System.out.println(Arrays.toString(a4));
        System.out.println(a4.length);

        int [][] matrix = new int [2][2];
        matrix[0][0] = 17;
        matrix[0][1] = 18;
        matrix[1][0] = 1;
        matrix[1][1] = 9;
        System.out.println(Arrays.deepToString(matrix));

        int $re;
         Set<Integer> s=new HashSet<>();
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s);
        System.out.println(s.size());

        //test2 t = new childtest();
        //childtest t1 = new test2();
        //System.out.println(t.i);
      //  System.out.println(t.i);

    }
}


