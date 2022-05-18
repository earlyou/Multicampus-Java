package p576;

public class MainThread2 {

	public static void main(String[] args) {		// main안에 직접 스레드를 만들기, 많이 쓰는 방법
		System.out.println("Start ..............................");
		
		Thread t1 = new Thread(new Runnable() {
			
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
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				while(i <= 100) {
					i++;
					System.out.println("MyThread2: "+i);
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();		// 스레드 t1 시작
		t2.start();
		
		
		Runnable r1 = new Runnable() {		// 인터페이스 이용
			
			@Override
			public void run() {
				int i = 0;
				while(i <= 100) {
					i++;
					System.out.println("MyThread3: "+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t3 = new Thread(r1);
		t3.start();
		
		System.out.println("End ..............................");
	}

}
