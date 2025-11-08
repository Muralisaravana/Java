package ThreadExamples;

public class Test3 {

	public static void main(String[] args) {

		Thread t = new Thread(()->System.out.println("Thread using lambda"));
		t.start();
	}

}

