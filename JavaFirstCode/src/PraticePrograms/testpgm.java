package PraticePrograms;

public class testpgm {

    public static void main(String [] args){

        String s ="Java Program";
        s=s.replace(" ","");
        int vowel=0;
        int consonents =0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='A'|| s.charAt(i)=='e'||s.charAt(i)=='E'|| s.charAt(i)=='i'||s.charAt(i)=='I'|| s.charAt(i)=='o'||s.charAt(i)=='O'|| s.charAt(i)=='u'||s.charAt(i)=='U'){
                vowel++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("No of vowels"+vowel);
        System.out.println("No of consonents"+consonents);
    }
}
