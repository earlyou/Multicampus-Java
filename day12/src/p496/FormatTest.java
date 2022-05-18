package p496;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {

	public static void main(String[] args) {
		double num = 1234123123456.789;
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.printf("\n");		// 콘솔에 나타내는 기능이기 때문에 의미가 없다. 화면에 표현하는 기능이 아님
		
		String str = df.format(num);	// double을 String으로 바꾸는 기능
		System.out.println(str);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:S, E a");
		String str2 = sdf.format(new Date());
		System.out.println(str2);
	}

}
