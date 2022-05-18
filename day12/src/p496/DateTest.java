package p496;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();		// 자신 컴퓨터에 설정된 시간이 출력
		System.out.println(date);	// Date안에 toString이 있기 때문에 바로 출력 가능
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY:MM:dd-hh:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY:MM:dd - hh:mm:ss");
		sdf2.setTimeZone(tz);
		System.out.println(sdf2.format(new Date()));
		
		Calendar cal = Calendar.getInstance(tz);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",yy,mm,dd,hh,mi,ss);
	}

}
