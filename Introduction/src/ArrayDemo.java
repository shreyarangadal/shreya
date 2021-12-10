
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[][] = new int [2][3];
		int a[][]= {{2,3,4},{5,1,7},{4,9,6}};
		int min=a[0][0];
		int mincolumn = 0 ;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
				if(a[i][j]<min) {
					min=a[i][j];
					mincolumn=j;
				}
			}
			System.out.println("");
		}
		System.out.println("Smallest Number is "+min);
		int max = a[0][mincolumn];
		int k=0;
		while(k<3) {
			if(a[k][mincolumn]>max) {
				max= a[k][mincolumn];
			}
			k++;
		}
		System.out.println("Big Number is "+max);
	}

}
