/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ AgeCheckException
 * 
 * 1. 개요 : 실습과제 4 
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
@SuppressWarnings("serial")
public class AgeCheckException extends Exception {
	public AgeCheckException(){
		
	}
	
	public AgeCheckException(Movie movie){
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
	}
}
