package part1;

public class test34 {
    public static void main(String[] args) {
     //   String string1 = "Great gresponsibility";
    /*int count;
    char string[] = string1.toCharArray();
        System.out.println("Duplicate characters in a given string: ");
    //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
        count = 1;
        for(int j = i+1; j <string.length; j++) {
            if(string[i]==string[j]  && string[i] != ' ') {

                count++;
                //Set string[j] to 0 to avoid printing visited character
                string[j] = '0';
            }
        }
        //A character is considered as duplicate if count is greater than 1
        if(count > 1 && string[i] != '0')
            System.out.println(string[i]);
    }*/

     //   int main()
      //  {
            //Initialize array
            int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};

            //Calculate length of array arr
            int length = arr.length;

        System.out.println("Duplicate elements in given array: \n");
            //Searches for duplicate element
            for(int i = 0; i < length; i++) {
                for(int j = i + 1; j < length; j++) {
                    if(arr[i] == arr[j])
                        System.out.println(arr[j]);
                }
            }

        }
    }

