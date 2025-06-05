package abstract_ex;

abstract class Emp{
	public static void intime(double intime) {
		System.out.println(intime);
	}
	public void outtime(double outtime) {
		System.out.println(outtime);
	}
	abstract void sal(double sal);
	abstract void leave(int leave);
}
class Manager extends Emp{
	@Override
	void sal(double sal) {
		// TODO Auto-generated method stub
		System.out.println(sal);
	}
	@Override
	void leave(int leave) {
		// TODO Auto-generated method stub
		System.out.println(leave);
	}
}
class Accountant extends Emp{
	@Override
	void sal(double sal) {
		// TODO Auto-generated method stub
		System.out.println(sal);
	}
	@Override
	void leave(int leave) {
		// TODO Auto-generated method stub
		System.out.println(leave);
	}
}

public class Main {
	public static void main(String[] args) {
		
		Manager man=new Manager();
		Emp.intime(10);
		man.outtime(6);
		man.sal(10000);
		man.leave(3);
		System.out.println();
		Accountant acc= new Accountant();
		acc.intime(11);
		acc.outtime(5);
		acc.sal(100000);
		acc.leave(10);
	}
}







