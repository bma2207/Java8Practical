package java8.com;

import java.util.function.Consumer;

public class consumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Bhushan_mahajan");
	}

}
