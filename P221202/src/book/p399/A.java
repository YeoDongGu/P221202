package book.p399;

public class A {
	void methodA() {
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
