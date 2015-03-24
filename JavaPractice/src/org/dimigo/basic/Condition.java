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
		
		int fee = 0;
		int distance = 30; // 거리(단위 : km)
		int carType = 1; // 1: 고속버스, 2: 경차
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		if(distance <= 0){
			System.out.println("거리는 양수만 가능합니다.");
			return;
		}
		
		System.out.println("거리 : " + distance + "km");
		
		if(distance <= 10) distance = 0;
		
		switch(carType){
		case 1:
			System.out.println("차종 : 고속버스");
			fee += 850;
			fee += (int)((distance - 1) / 10) * 300;
			break;
		case 2:
			System.out.println("차종 : 경차");
			fee += 300;
			fee += (int)((distance - 1) / 10) * 200;
			break;
		default:
			System.out.println("차종 : 그 외");
			fee += 600;
			fee += (int)((distance - 1) / 10) * 200;
		}
		
		System.out.println("통행료 : " + fee + "원");
		

	}

}
