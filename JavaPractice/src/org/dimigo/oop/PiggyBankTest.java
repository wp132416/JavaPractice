/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 * 
 * 1. 개요 : 12번째 실습과제
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 가족 구성원 객체 생성
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("남동생");
		
		// 총 인원 수 출력
		FamilyMember.printMemberCnt();
		
		// 저금통에 돈 채우기
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mother, 5000);
		PiggyBank.putMoney(me, 2000);
		PiggyBank.putMoney(brother, 1000);
		
		// 잔고 출력
		PiggyBank.printBalance();
		
		// 저금통에 돈 채우기
		PiggyBank.putMoney(me, 1000);
		
		// 염치가 없는 남동생이 10만원을 빼가려고 함
		PiggyBank.stealMoney(brother, 100000);
		
		PiggyBank.stealMoney(brother, 10000);
		
		// 잔고 출력
		PiggyBank.printBalance();
	}

}
