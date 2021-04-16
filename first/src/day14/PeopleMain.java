package day14;

import java.util.*;

public class PeopleMain {

	public static void main(String[] args) {
		// People클래스를 사용하는 main클래스

		//peo1 = People클래스 타입의 변수 라고 이해할 수 있다.
		People peo1 = new People();
		People peo2 = new People("이름2", "111111-1111111", "주소2", 20);
		People peo3 = new People();

		peo1.setName("이름1");
		peo1.setrNumber("000000-0000000");
		peo1.setAddress("주소1");
		peo1.setAge(10);

		peo3.setName("이름3");
		peo3.setrNumber("222222-2222222");
		peo3.setAddress("주소3");
		peo3.setAge(30);

		List<People> peopeleList = new ArrayList<People>();

		peopeleList.add(peo1);
		peopeleList.add(peo2);
		peopeleList.add(peo3);

		for (int i = 0; i < peopeleList.size(); i++) {
			System.out.println("이름 : " + peopeleList.get(i).getName());
			System.out.println("주민번호 : " + peopeleList.get(i).getrNumber());
			System.out.println("주소 : " + peopeleList.get(i).getAddress());
			System.out.println("나이 : " + peopeleList.get(i).getAge());
			System.out.println();
		}
		System.out.println();

		// toString메소드를 선언하여서 객체의 각 필드값의 값이 출력이 된다.
		System.out.println(peopeleList.get(0));
		System.out.println(peo1);
		System.out.println();

		for (int i = 0; i < peopeleList.size(); i++) {
			System.out.println(peopeleList.get(i));
		}

		//PeopleService클래스의 객체 선언
		PeopleService ps = new PeopleService();
		
		System.out.println("listPrint 호출 전");
		ps.listPrint(peopeleList);
		System.out.println("listPrint 호출 끝");

		for (int i = 0; i < peopeleList.size(); i++) {
			System.out.println(peopeleList.get(i));
		}
		
		ps.peoplePrint(peo2);
	}

}
