import java.io.IOException;
import java.util.ArrayList;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
DataDriven d = new DataDriven();
ArrayList data = d.getData("Purchase");

System.out.println(data.get(0));
System.out.println(data.get(1));
System.out.println(data.get(2));
//System.out.println(data.get(3));
	}

}
