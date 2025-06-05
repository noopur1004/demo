package oveeriding;

class Policy{
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
class Emp extends Policy{
	@Override
	public void sal(double sal) {
		System.out.println(sal);
	}
	@Override
	public void sal(double sal, double bonus) {
		
		System.out.println(sal+bonus);
	}
	@Override
	public void sal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
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