package day14;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// Student클래스를 이용하는 main클래스

		Student stu1 = new Student();

		//setter를 이용하여 필드 값 지정하기
		//private로 지정했기 때문에 접근 불가
		//stu1.name = "이름1";
		stu1.setName("학생1");
		//stu1.address = "주소1";
		stu1.setAddress("주소1");
		//stu1.phone = "010-1111-1111";
		stu1.setPhone("010-1111-1111");
		
		//getter를 이용하여 필드값 가져오기
		String var2 = stu1.getName();
		System.out.println(var2);

		System.out.println(stu1.getAddress());

		Student stu2 = new Student("이름2", "주소2", "010-2222-2222");

		// Student객체를 ArrayList에 저장하기
		// Student객체를 담을 수 있는 ArrayList필요
		List<Student> stuList = new ArrayList<Student>();

		// 객체안에 있는 필드의 값이 모두 함께 통으로 삽입이 된다.
		// ==> name, phone, address의 값이 모두 인덱스 0번에 들어가게 된다.
		stuList.add(stu1);
		stuList.add(stu2);

		// stuList의 0번 인덱스에 저장한 stu1의 name값 출력하기
		System.out.println(stuList.get(0).getName());

		// 필드값을 수정하고 활용할 수 있다.
		String var1 = stuList.get(0).getName();
		System.out.println(var1);

		stuList.get(1).setName("학생2이름변경");
		System.out.println(stuList.get(1).getName());

	}

}
