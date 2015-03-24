package org.dimigo.basic;
/**
 * << 번째 수행평가 과제 >>
 * 내용 : 고속도로 통행료 계산
 * 작성일자 : 2015년 3월 24일
 * @author wp132416
 * @version 1.0
 */

public class Condition {

	public static void main(String[] args) {
		
		// initialize variable
		int fee = 0;
		int distance = 30; // Distance(단위 : km)
		int carType = 1; // 1: Lowest Bus, 2: Small Car
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		// distance validation
		if(distance <= 0){
			System.out.println("거리는 양수만 가능합니다.");
			return;
		}
		
		System.out.println("거리 : " + distance + "km");
		
		if(distance <= 10) distance = 0;
		
		switch(carType){
		case 1:
			System.out.println("차종 : 고속버스");
			fee += 850; // Default Fee of Lowest Bus
			fee += (int)((distance - 1) / 10) * 300;
			break;
		case 2:
			System.out.println("차종 : 경차");
			fee += 300; // Default Fee of Small Car
			fee += (int)((distance - 1) / 10) * 200;
			break;
		default:
			System.out.println("차종 : 그 외");
			fee += 600; // Default Fee of Others
			fee += (int)((distance - 1) / 10) * 200;
		}
		
		// print fee
		System.out.println("통행료 : " + fee + "원");

	}

}
