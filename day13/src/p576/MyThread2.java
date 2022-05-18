package p576;

public class MyThread2 implements Runnable{			// Interface 상속받기

	@Override
	public void run() {
		int i = 0;
		while(i <= 100) {
			i++;
			System.out.println("MyThread2: "+i);
			try {
				Thread.sleep(1500);			// MyThread1보다 조금 느리게 실행되는 스레드 구현
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}		
	
}
