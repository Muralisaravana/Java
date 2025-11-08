package ThreadExamples;

public class ThreadExample 
{

	public static void main(String[] args)
	{

		Thread t1 = new Thread(()->{
			for(int i = 1; i <= 3 ; i++) {
				System.out.println("Thread -1 :" + i);
				try {
					Thread.sleep(5000);
				}
			 catch (InterruptedException e) {
                e.printStackTrace();
            
			}
			}		
		});
		
		Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread-2: " + i);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
		
		t1.start();
		t2.start();
		
		try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
	}

}
