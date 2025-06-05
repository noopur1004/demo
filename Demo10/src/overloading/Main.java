package overloading;

class Emp{
	public void sal(double sal) {
		System.out.println(sal);
	}
	public void sal(double sal, double bonus) {
		System.out.println(sal+bonus);
	}
	public void sal(double sal, double bonus, double tax) {
		System.out.println(sal+bonus-tax);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.sal(10000);
		emp.sal(5000);
		emp.sal(2000);
	}
}
