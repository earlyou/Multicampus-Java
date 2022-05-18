package p576;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Start");
		int i = 0;
		while(i <= 300) {
			System.out.println(i);
			i++;
			try {
				Thread.sleep(1000);					// 1초 기다리기, 속도조절
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		System.out.println("End");
	}
}
