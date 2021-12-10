package PraticePrograms;
import java.util.Arrays;
import java.util.Collections;

public class SortusingBuiltinMethods {
    public static void main(String[] args) {
        int a[]={1,2,5,0,100,88,1};
        System.out.println("Array before sorting : " + Arrays.toString(a));
        //Approach - 1
        //Arrays.parallelSort(a);
        //System.out.println("Array after sorting : " + Arrays.toString(a));

        //Approach - 2
        Arrays.sort(a);
        System.out.println("Array after sorting : " + Arrays.toString(a));
        Integer a1[]={1,2,5,0,100,88,99,6,67,84,1};
        //Approach - 3 -reverse order
        Arrays.sort(a1, Collections.reverseOrder());
        System.out.println("Array after sorting : " + Arrays.toString(a1));
}
}
