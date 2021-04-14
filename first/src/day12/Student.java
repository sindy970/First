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
}
