/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ FamilyMember
 * 
 * 1. 개요 : 12번째 실습과제
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class FamilyMember {
	// 총 인원수
	private static int memberCnt;
	
	// 구성원 이름
	private String memberName;
	
	// 생성자
	public FamilyMember(String memberName){
		this.memberName = memberName;
		memberCnt++;
	}

	public String getMemberName() {
		return memberName;
	}

	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
