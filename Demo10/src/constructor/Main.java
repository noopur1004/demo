package constructor;

class A{
	String name;
	int id;
	double sal;
	public A(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
}
   
public class Main {
	public static void main(String[] args) {
		A  a=new A("sam", 1, 10000);
		System.out.println(a);
	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
