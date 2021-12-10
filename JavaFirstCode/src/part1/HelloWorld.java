package part1;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {
    static final String pi = "3.14";
    public static void main (String [] args) {

/*
        int assignment_grade = 40;
        int exam_grade = 180;
        int assignment_total;
        int exam_total;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter obtained assignment marks");
        assignment_total = input.nextInt();

        System.out.println("Please enter obtained exam marks");
        exam_total = input.nextInt();

        int student_grade = assignment_total + exam_total;
        int total = assignment_grade + exam_grade;
        float percentage = (float) student_grade/total * 100;
        System.out.println("Student obtained marks " + student_grade);
        System.out.println("Total percentage " + percentage);
*/
        double grade1 = 3.3;
        double grade2 = 5.4;
        double grade3 = 3.3;

        double average = (grade1+grade2+grade3)/3;
        System.out.println(average);


        //Date date = new Date();
        //System.out.println(date);

        int [] array = new int[4];
        int i=3;
        while(i< array.length){
            System.out.println("while");
            i++;
        }
        int j=2;
        do {
        System.out.println("dowhile");
        j++;
        }while(j< array.length);
        }
}
