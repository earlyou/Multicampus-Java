package p576;

public class MyThread1 extends Thread{			// Thread 클래스에서 상속받아서 만드는 방법

	@Override
	public void run() {
		int i = 0;
		while(i <= 100) {
			i++;
			System.out.println("MyThread1: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}	
	
}
