package interface_ex;

interface Emp{
	abstract void intime(int intime);
	abstract void outtime(int outtime);
	abstract void sal(double sal);
}
class Manager implements Emp{
	@Override
	public void intime(int intime) {
		// TODO Auto-generated method stub
		System.out.println(intime);
	}
	@Override
	public void outtime(int outtime) {
		// TODO Auto-generated method stub
		System.out.println(outtime);
	}
	@Override
	public void sal(double sal) {
		// TODO Auto-generated method stub
		System.out.println(sal);

	}
}
class Accountant implements Emp{
	@Override
	public void intime(int intime) {
		// TODO Auto-generated method stub
		System.out.println(intime);
	}
	@Override
	public void outtime(int outtime) {
		// TODO Auto-generated method stub
		System.out.println(outtime);

	}
	@Override
	public void sal(double sal) {
		// TODO Auto-generated method stub
		System.out.println(sal);
	}
}

public class Main {
	public static void main(String[] args) {
		Manager manager=new Manager();
		manager.intime(10);
		manager.outtime(6);
		manager.sal(10000);
		Accountant acc=new Accountant();
		acc.intime(8);
		acc.outtime(10);
		acc.sal(20000);
	}
}