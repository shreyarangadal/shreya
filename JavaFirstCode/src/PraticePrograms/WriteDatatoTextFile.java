package PraticePrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteDatatoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fr=new FileWriter("C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Desktop\\Test123.txt");
        BufferedWriter br =new BufferedWriter(fr);
        br.write("Selenium with java");
        br.write("Selenium with c#");
        br.write("Selenium with python");
        System.out.println("Finished!!!!!");
        br.close();//without writing close data will not be written
}
}