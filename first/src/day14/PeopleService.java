package day14;

import java.util.List;

public class PeopleService {
	//매개변수에는 타입 과 이름이면 여러가지 형태의 매개변수가 올 수 있다.
	
	//ArrayList를 받아와서 출력하는 메소드 선언
	//ArrayList를 받아오기 위한 매개변수 필요. => List<People> list1 ==> 받아오기 위한 변수의 타입과 변수명이 필요하다.
	void listPrint(List<People> list1) {
		//변수 명은 개발자가 변경할 수 있다.
		//List타입의 변수를 매개변수로 선언하면 List타입의 내용만 담을 수 있다.
		System.out.println("listPrint호출");
		System.out.println(list1.get(0));
		
		list1.get(1).setName("ps에서 변경");
		System.out.println(list1.get(1));
	}
	
	//매개변수에 클래스가 오는 메소드 
	void peoplePrint(People peo) {
		//매개변수에는 클래스가 올 수도 있다.
		//일종의 객체 역활을 한다.
		//클래스 타입의 변수는 클래스 안에 있는 내용을 담기 위한 변수이다.
		System.out.println("peoplePrint 호출");
		System.out.println(peo);
	}

}
