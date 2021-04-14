package day12;

public class Student {

	//필드 선언
	String name;
	int stuNum;
	
	//기본생성자 선언
	Student(){
		//기본생성자를 호출하게 되면 바로 실행이 된다.
		System.out.println("기본생성자 호출");
		
		/*생성자를 아무것도 선언하지 않으면 기본생성자를 쓸 수 있지만
		* 기본생성자 형태가 아닌 생성자를 선언하면 기본생성자를 쓸수없다.
		* 기본생성자를 쓰고 싶다면 따로 정의 해줘야 함.
		*/
	}
	
	//매개변수가 있는 생성자 선언
	//매개변수가 있는 생성자를 정의하는 순서가 중요하다
	//이 생성자를 이용할 경우 name,stuNum의 순서로 값을 지정해줘야 한다.
	//반대로 지정할 시에 오류가 발생한다.
	Student(String name, int stuNum){
		//매개변수있는 생성자를 호출하게 되면 바로 실행이 된다.
		System.out.println("매개변수 생성자 호출");
		//필드에 값을 저장하는 변수
		this.name = name;
		this.stuNum = stuNum;
	}
	
	
	//메소드 선언
	//리턴이 없는 메소드 선언
	//메소드 이름을 지을 때 변수 이름짓는 규칙을 따른다.
	// -> 소문자로 시작하고 두번째단어시작시 대문자 사용
	void fieldPrint() {
		System.out.println("메소드호출됨");
		System.out.println(this.name);
		System.out.println(this.stuNum);
		//필드의 구분을 위해 this.변수이름 을 사용한다.
		
		/*
		 * void : 리턴이 없다는 의미 => 호출하고 실행하고 끝 => 반환 값이 없다.
		 * 메소드 이름 : fieldPrint
		 * 매개변수 : 없음
		 * ->소괄호 안에 매개변수 사용가능
		 * 
		 * void 자리에는 int,String과 같은 타입이 올수도 있다.
		 * ==> return값이 있는경우에
		 */
		
	}
	
	//리턴이 있는 메소드 선언
	int numberMethod() {
		int num = 10;
		//특정 메소드 안에서 선언을 하게 되면 변수로 인식을 한다.
		return num; //호출하면 이 num값을 줌
		/*int : 리턴되는 값이 int타입
		 * 메소드 이름 : numberMethod
		 * 매개변수 : 없음
		 * 리턴값 : num
		 */
	}
	
	String stringMethod() {
		String val = "리턴값";
		return val;
		/*Srting : 리턴되는 값이 String
		 * 메소드 이름 : stringMethod
		 * 매개변수 없음
		 */
	}
	
	//매개변수가 있는 메소드 선언
	int numberMethod2(int num1) {
		//int로 메소드를 선언한 경우 실행문에 반드시 int타입의 return이 있어야 한다.
		int num2 = 10;
		int sum  = num1 + num2;
		return sum;
		/*int : 리턴되는 값이 int타입
		 * 메소드 이름 : numberMethod2
		 * 매개변수 있음
		 */
	}
}
