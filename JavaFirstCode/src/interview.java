import java.util.HashSet;
import java.util.Set;

public class interview {
    public static void main(String [] args) {
        String input = "Android gave new life to Java";
        boolean isFound = input.indexOf("Android") != -1 ? true : false; //true
        System.out.println(input.indexOf("Android"));
        System.out.println(isFound);
        //counting occurrence of character with loop
        int charCount = 0;
        for(int i =0 ; i<input.length(); i++){
            if(input.charAt(i) == 'a'){
                charCount++;
            }
        }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for loop  " + charCount);

       /* charCount = 0; //resetting character count
        for(int i=0;i<input.length();i++){
            if(input.equalsIgnoreCase("a")){
                charCount++;
            }
        }*/
        charCount = 0;
        for(char ch: input.toCharArray()){
            if(ch=='a'||ch=='A'){
                charCount++;
            }
        }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCount);
char []a = {'a','b','c','d','b','a'};

            Set<Integer> set = new HashSet<>();
            for(int i=0;i<a.length;i++){
                if(!set.add((int) a[i])) {
                    System.out.println( a[i]);
                }
            }
            //return -1; // no duplicates found

       // return 0;

    }

}
