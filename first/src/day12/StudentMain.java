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
		
		System.out.println("메소드 호출 전");
		
		//fieldPrint메소드 호출
		stu1.fieldPrint();
		//형식 : 객체이름.메소드이름();
		//stu1의 변수의 값이 출력되고 이용이 된다.
		
		stu2.fieldPrint();
		
		System.out.println("리턴이 있는 메소드 호출");
		//리턴이 있는 메소드 호출
		//호출만 하고 끝이 아니라 리턴값을 활용하는 내용이 필요하다.
		int aa = 0;
		System.out.println(aa);
		aa = stu1.numberMethod();
		System.out.println(aa);
		//aa.numberMethod(); -> aa라는 변수는 Student클래스로 선언한 변수가 아니기 때문에 사용이 되지 않는다.
		
		System.out.println(stu1.numberMethod()); //numberMethod메소드의 리턴값인 num변수가 있기때문에 10이 출력이 된다.
		
		System.out.println("String메소드 호츨");
		System.out.println(stu2.stringMethod());
		
		String bb = stu2.stringMethod();
		System.out.println(bb);
		
		//매개변수 있는 메소드 호출
		Student stu4 = new Student();
		int cc = stu4.numberMethod2(30);
		System.out.println(cc);
		
		int number1 = 50;
		cc = stu4.numberMethod2(number1);
		//매개변수 안에 변수명을 넣을 수 있다.
		System.out.println(cc);
	}

}
