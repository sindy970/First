package day14;

import java.util.*;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		//단어 5개를 입력 받아 출력 후 가장 긴 단어 출력하기
		
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			list.add(sc.next()); //바로 스캔을 받는 것도 가능하다.
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		int longword = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(longword).length() < list.get(i).length()) {
				//문자열의 길이도 length메소드를 이용하여 알 수 있다.
				longword = i;
			}
		}
		System.out.println("가장 긴 단어는 : " + list.get(longword));

	}

}
