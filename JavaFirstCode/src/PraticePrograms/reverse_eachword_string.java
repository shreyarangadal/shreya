package PraticePrograms;

public class reverse_eachword_string {
    public static void main(String[] args) {
        String str ="Welcome to Java Demo";
        /*
        //Approach - 1
        String []words = str.split(" ");
        String revString="";
        for(String l:words){
            String revword="";
            for(int i=l.length()-1;i>=0;i--){
                revword=revword+l.charAt(i);
            }
            revString = revString + revword+" ";
        }
            System.out.println(revString);
         */

        //Approach - 2
        String []words = str.split("\\s");
        String revString="";
        for(String l:words){
            StringBuilder sb = new StringBuilder(l);
            sb.reverse();
            revString = revString + sb.toString()+" ";
        }
        System.out.println(revString);
    }
}
