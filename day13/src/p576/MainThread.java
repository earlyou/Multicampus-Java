package p576;

public class MainThread {

	public static void main(String[] args) {	// MyThread 2개를 한꺼번에 실행시키기, MultiThread
		System.out.println("Start ...........................");
		MyThread1 t1 = new MyThread1();		// 클래스에서 상속받은 스레드
		t1.start();							// 스레드 Run
		MyThread2 t2 = new MyThread2();		// 인터페이스에서 상속받은 스레드
		Thread tt2 = new Thread(t2);		// 인터페이스 객체를 스레드 객체에 넣고 실행해야 함
		tt2.start();
		
		System.out.println("End ...........................");
	}

}
