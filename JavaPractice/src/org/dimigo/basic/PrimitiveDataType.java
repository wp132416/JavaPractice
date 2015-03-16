package org.dimigo.basic;

/**
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 * @author wp132416
 * @version 1.0
 */
public class PrimitiveDataType {
	
	public static void main(String[] args) {
	
		// 변수 초기화
		String name = "아이유";
		boolean isMale = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		// 데이터 출력
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + ((isMale) ? "남자" : "여자"));
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
	}
}
