package java8.com;

@FunctionalInterface
interface Lam {
	void sqr(int a, int b);

	default void add() {
		System.out.print("Default method....");
	}

	static void msg() {
		System.out.println("Static method.....");
	}
}

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lam l = (a, b) -> {
			System.out.println("add " + (a * b));
			System.out.println("add " + (a + b));
		};
		l.sqr(5, 6);
		l.sqr(4, 7);
		l.add();
		Lam.msg();
	}
}
