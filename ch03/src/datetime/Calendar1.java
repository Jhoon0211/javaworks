package datetime;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// Calendar 클래스 사용
		Calendar cal = Calendar.getInstance() ;
		System.out.println(cal);
		System.out.println(cal.getCalendarType());

		
		// YEAR, MONTH = 상수
		// 날짜 - 월 + 1
		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH) + 1;
		// 10이하의 1~9월 이면 0을 포함하여 표기하며, 아니면 그대로 표기 (10~12월)
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		
		int date = cal.get(Calendar.DATE);
		String strDate= (date < 10) ? ("0" + date) : ("" + date);
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		// 시간
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		String strMinute= (date < 10) ? ("0" + minute) : ("" + minute);
		int second = cal.get(Calendar.SECOND);
		String strSecond= (date < 10) ? ("0" + second) : ("" + second);

		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.printf("%s년 %s월 %s일\n", year, strMonth, strDate);
		System.out.printf("%d시 %s분 %s초\n", hour, strMinute, strSecond);
		
		// 요일 : 0-일, 1-월, 2-화, 3-수, 4-목, 5-금, 6-토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] days = new String[] {"일","월","화","수","목","금","토"};
		System.out.println(day);
		System.out.println("오늘은" + days[day-1] + "요일입니다.");
	}

}
