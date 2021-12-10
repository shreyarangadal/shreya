package PraticePrograms;

public class Microland {

public static void main(String [] args) {
    String str = "my name is Shreya";

    //char[] ch = str.toCharArray();

    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        for (int j = i + 1; j < str.length(); j++) {
           //char s = str.charAt(j);
            if (str.charAt(i)==str.charAt(j)) {
                count++;
            }
        }
        if(count>1){
            System.out.println(str.charAt(i) + " count is - " + count);
        }

    }
}
}
