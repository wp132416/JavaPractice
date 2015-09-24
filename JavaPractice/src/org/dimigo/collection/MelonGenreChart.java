/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 * 
 * 1. 개요 : 실습과제 6
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Music> ballad = new ArrayList<>();
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		
		List<Music> dance = new ArrayList<>();
		dance.add(new Music("커피", "유재환,김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		Map<String, List<Music>> map = new HashMap<>();
		
		System.out.println("------ << 멜론 장르별 차트 >> ------");
		
		map.put("발라드", ballad);
		map.put("댄스", dance);
		
		printMap(map);
		System.out.println();
		
		System.out.println("------ << 발라드 3위 곡 변경 >> ------");
		ballad.set(2, new Music("지우고 지워도", "차수경"));
		map.replace("발라드", ballad);
		printMap(map);
		System.out.println();
		
		System.out.println("------ << 발라드 1위 곡 삭제 >> ------");
		ballad.remove(0);
		map.replace("발라드", ballad);
		printMap(map);
		System.out.println();

		System.out.println("------ << 전체 리스트 삭제 >> ------");
		map.clear();
		printMap(map);
		System.out.println();
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		int idx = 1;
		
		for(Map.Entry<String, List<Music>> entry : map.entrySet()){
			System.out.println("[" + entry.getKey() + "]");
			for(Music music : entry.getValue()){
				System.out.println((idx++) + ". " + music.toString());
			}
		}
	}

}
