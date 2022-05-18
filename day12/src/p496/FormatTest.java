package p496;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {

	public static void main(String[] args) {
		double num = 1234123123456.789;
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.printf("\n");		// �ֿܼ� ��Ÿ���� ����̱� ������ �ǹ̰� ����. ȭ�鿡 ǥ���ϴ� ����� �ƴ�
		
		String str = df.format(num);	// double�� String���� �ٲٴ� ���
		System.out.println(str);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:S, E a");
		String str2 = sdf.format(new Date());
		System.out.println(str2);
	}

}
