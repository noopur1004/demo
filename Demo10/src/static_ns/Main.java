package static_ns;

class Emp{
	public static String c_name="sdac";
	public static String c_add="goa";
	String name="noopur";
	String add="pune	";
	double sal=10000;
	
	public static void displayCompInfo() {
		System.out.println(c_name);
		System.out.println(c_add);
	}
	
	public void displayEmpInfo() {
		System.out.println(name);
		System.out.println(add);
		System.out.println(sal);
	}
}

public class Main {
	public static void main(String[] args) {
	    Emp a=new Emp();
		Emp.displayCompInfo();
		a.displayEmpInfo();
	}
}
