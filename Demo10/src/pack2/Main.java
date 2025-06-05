package pack2;
import pack1.A;

class D extends A {
	public static void main(String[] args) {
		D ob=new D();
		System.out.println(ob.a);
		System.out.println(ob.c);
	}
}
class E {
	public static void main(String[] args) {
		A ob=new A();
		System.out.println(ob.a);
	}
}
