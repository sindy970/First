package day14;

import java.util.List;

public class PeopleService {
	//ArrayList를 받아와서 출력하는 메소드 선언
	//ArrayList를 받아오기 위한 매개변수 필요. => List<People> list1 ==> 받아오기 위한 변수의 타입과 변수명이 필요하다.
	void listPrint(List<People> list1) {
		//변수 명은 개발자가 변경할 수 있다.
		System.out.println("listPrint호출");
		System.out.println(list1.get(0));
		
		list1.get(1).setName("ps에서 변경");
		System.out.println(list1.get(1));
	}
	
	void peoplePrint(People peo) {
		//매개변수에는 클래스가 올 수도 있다.
		System.out.println("peoplePrint 호출");
		System.out.println(peo);
	}

}
