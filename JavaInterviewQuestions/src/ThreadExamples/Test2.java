package ThreadExamples;

public class Test2 {

	public static void main(String[] args) {
         Thread t = new Thread(new MyRunnable());
         t.start();
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Running in Thread: " + Thread.currentThread().getName());
	}
	
}
