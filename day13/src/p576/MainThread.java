package p576;

public class MainThread {

	public static void main(String[] args) {	// MyThread 2���� �Ѳ����� �����Ű��, MultiThread
		System.out.println("Start ...........................");
		MyThread1 t1 = new MyThread1();		// Ŭ�������� ��ӹ��� ������
		t1.start();							// ������ Run
		MyThread2 t2 = new MyThread2();		// �������̽����� ��ӹ��� ������
		Thread tt2 = new Thread(t2);		// �������̽� ��ü�� ������ ��ü�� �ְ� �����ؾ� ��
		tt2.start();
		
		System.out.println("End ...........................");
	}

}
