package CH16;

import java.util.Calendar;
import java.util.Date;

public class C05DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getYear()+1900);
		System.out.println(d1.getMonth()+1);
		System.out.println(d1.get()); // 요일 정보 0~6
		System.out.println(d1.getDay()); 
		System.out.println(d1.getDay()); 
		System.out.println(d1.getDay()); 
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));  //요일(1-7,일-토)
		

		
	}

}
