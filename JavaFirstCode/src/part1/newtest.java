package part1;

public class newtest {
    public static void main(String [] args) {
        String s1 = "abcdefg";
        String s2 = "cde";
        boolean flag = false;
        String arr[] = s1.split(" ");
        char[] s3 = s2.toCharArray();
        char[] s4 = s1.toCharArray();

        for (int i = 0; i <s3.length;i++) {
            for (int j = 0; j < s4.length; j++) {
                //if(arr[i].equalsIgnoreCase(String.valueOf(s3[0]))){
                //if(arr[i].equals(s2)){
                //if(arr[i].contains(s2)){
                if (s3[i]==s4[j]) {
                    //System.out.println(arr[i]);
                    flag = true;
                }
            }
        }
        System.out.println(flag);
    }
}

