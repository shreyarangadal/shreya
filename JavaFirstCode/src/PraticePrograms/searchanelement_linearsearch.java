package PraticePrograms;

public class searchanelement_linearsearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        int search_element =0;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
                if (search_element ==arr[i]) {
                    System.out.println("Found element in an array at an index of : " + i);
                    flag=true;
                    break;
                }
        }
        if(flag==false) {
            System.out.println("Not Found element in an array ");
        }
    }
}
