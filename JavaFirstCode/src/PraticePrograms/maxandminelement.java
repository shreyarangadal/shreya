package PraticePrograms;

public class maxandminelement {
    public static void main(String[] args){
        int a[]={1,2,3,5,6,7};
        int max=a[0];
        for(int i=0;i< a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum element of an array "+max);

        int min=a[0];
        for(int i=0;i< a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum element of an array "+min);
    }
}
