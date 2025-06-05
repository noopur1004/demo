package pojo_ex;

class Emp{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.setId(1);
		emp.setName("sam");
		emp.getId();
		emp.getName();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}
}
