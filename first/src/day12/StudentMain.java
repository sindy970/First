package day12;

public class StudentMain {

	public static void main(String[] args) {
		//Student클래스의 값을 받는 main클래스
		
		Student stu1 = new Student();
		stu1.name = "이름1";
		stu1.stuNum = 20;
		
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		
		//Student클래스에서 호출한다.
		Student stu2 = new Student("이름2", 30);
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
		System.out.println(stu2); //주소가 나옴 결과 : day12.Student@7637f22 가 나옴
		
		

	}

}
