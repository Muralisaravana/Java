package ThreadExamples;

public class Test {

	public static void main(String[] args) {
       
		MyThread mt = new MyThread();
		mt.start();
		
	}

}

class MyThread extends Thread
{
	public void run() {
		System.out.println("Running in Thread: " + Thread.currentThread().getName());
	}
}
