package PraticePrograms;

public class sumofarray {
    public static void main(String[] args) {
        int a[]={1,2,1,2,9};
        int sum=0;
        /*
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }*/
        //enhanced for loop
        for(int value:a){
            sum=sum+value;
        }

        System.out.println(sum);

    }
}
