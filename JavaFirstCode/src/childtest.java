import part1.Child;
import part1.parent;
import part1.test;
import part1.test3;

import java.util.Properties;

public class childtest  extends Child {

    public void x(){
    System.out.println("child4567");
    }
    public static void main(String[] args) {
        //Child obj = new childtest();
        //obj.x();

        //  }

        // int i=20;
        //public static void main(String[] args) {
        Child c = new childtest();
       // c.x();
        //   test2 t = new childtest();
        //   c.engine();//parent
        //   c.bodyColr();//child

        //   }
        //@Override
        //public void bodyColr(){
        //     System.out.println("2");
        // }
        //@Override
        // public void engine(){
        // System.out.println(3);
        //
        //

        Properties p = System.getProperties();
        p.setProperty("pirate", "scur");
        String s = p.getProperty("argprop") + " ";
        s += p.getProperty("pirate");
        System.out.println(s);

        try {
            int x = 0;
            for (x = 1; x < 4; x++);
                System.out.println(x);

        }
            catch(Exception e){

            }
            finally{
                System.out.println("e");
            }
        }
    }
