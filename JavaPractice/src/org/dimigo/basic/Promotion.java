package org.dimigo.basic;

/**
 * << 두번째 수행평가 과제 >>
 * 내용 : 디미베네 연간 인건비 계산하기
 * 작성일자 : 2015년 3월 17일
 * @author wp132416
 * @version 1.0
 */
public class Promotion {
	public static void main(String[] args) {
		
		int monthlyPay = 1700000;
		int cntPerson = 3;
		int cntShop = 1500;
		
		long yearlyCosts = (long)monthlyPay * 12 * cntPerson * cntShop;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", monthlyPay) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", cntPerson) + "명");
		System.out.println("점포 수 : " + String.format("%,d", cntShop) + "개");
		System.out.println();
		System.out.println("연간 인건비 : " + String.format("%,d", yearlyCosts) + "원");
	}
}
