package p576;

public class MyThread2 implements Runnable{			// Interface ��ӹޱ�

	@Override
	public void run() {
		int i = 0;
		while(i <= 100) {
			i++;
			System.out.println("MyThread2: "+i);
			try {
				Thread.sleep(1500);			// MyThread1���� ���� ������ ����Ǵ� ������ ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}		
	
}
