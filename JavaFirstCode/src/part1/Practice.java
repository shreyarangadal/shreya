package part1;

public class Practice {
    public static final double pi_num=3.142;
    public  int AddNum(int a ,int b){
        return a+b+11;
    }
    public static void main (String [] args){
        int a=10;
        int b=12;
        int c= 5;
        int d = 6;
        Practice Practice = new Practice();
        System.out.println(Practice.AddNum(a,b));
        System.out.println(Practice.AddNum(c,d));
        //pi_num=4;
        System.out.println(pi_num);
    }
}
