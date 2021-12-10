
public class StaticVar {
//Instance Variables	
String name;
String address;
static String city;
static int i;
//Defining the static variables
static {
	city = "Bangalore";
	i=0;
}
StaticVar(String name,String address){
	this.name=name;
	this.address=address;
	i++;
	System.out.println(i);	
}
public void getaddress() {
	System.out.println(name +" "+address + " "+ city);
}
//static method only static variables can be called
public static void getcity() {
	System.out.println(city);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticVar sd = new StaticVar("Shreya","Marathahalli");
	StaticVar sd1 = new StaticVar("Asit","Monekollala");
	sd.getaddress();
	sd1.getaddress();
	//to call the static method no need to create a object
	StaticVar.getcity();
	}

}
