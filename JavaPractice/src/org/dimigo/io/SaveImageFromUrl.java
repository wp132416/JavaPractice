/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   |_ SaveImageFromUrl
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 22.
 * </pre>
 * 
 * @author		: YM
 * @version		: 1.0
 */
public class SaveImageFromUrl {

	private static OutputStream os;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String imageUrl = "https://www.google.co.kr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
		
		try {
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			os = new FileOutputStream("files/logo.png");
			int result;
			byte buf[] = new byte[is.available()];
			
			while((result = is.read(buf)) != -1){
				os.write(buf, 0, result);
			}
			
			System.out.println("파일 다운로드 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
