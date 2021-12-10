package PraticePrograms;
//String policyMessage2= “Dear user your  policy Number with number  P-10242724343462442/81 has been created sucesfully  in the System “

//Output2: P-10242724343462442/81
public class javaprgm {
    public static void main(String[] args) {
String s ="Dear user your  policy Number with number  P-10242724343462442/81 has been created sucesfully  in the System";
String []str= s.split(" ");
for(int i=0;i< str.length;i++){
    String a = str[i];
    if(a.contains("P-")){
        System.out.println(a);
    }
}

int x=10;
long y=20;
short z=30;

        System.out.println(++x + y++ * z);

}
}
