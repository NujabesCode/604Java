package ch10;

import java.util.Calendar;

public class Ex10_3 {

	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600,60,1};
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();	
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 10);
		
		time2.set(Calendar.HOUR_OF_DAY,10);
		time2.set(Calendar.MINUTE,10);
		time2.set(Calendar.SECOND,10);
		
		System.out.println("time1 :"+time1.get(Calendar.HOUR_OF_DAY)+"시 "
			+time1.get(Calendar.MINUTE)+"분 " + time1.get(Calendar.SECOND)+"초");
		System.out.println("time2 :"+time2.get(Calendar.HOUR_OF_DAY)+"시 "
			+time2.get(Calendar.MINUTE)+"분 " + time2.get(Calendar.SECOND)+"초");
		
		//Math.abs는 절대값을 구하는 함수. 뒤에 time1이 더 크면 음수가 나오니까.
		long difference =
				Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println("time1과 time2의 차이는 " + difference +"초 입니다.");
		
		String tmp = "";
		for(int i =0; i< TIME_UNIT.length;i++) {
			
			//     difference/TIME_UNIT[0] 
			//       36580   /  3600       + 시간
			//              10
			//           tmp = 10
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
			
			//	   difference = difference % TIME_UNIT[i]
			//                    36580    %  3600
			//     difference =           580           
		}
		System.out.println("시분초로 변환하면" +tmp+"입니다.");
	}

}
