package day12;

public class Member {
	String id, name;
	int password, age;
	
	//기본생성자 선언
	Member(){
		//실행내용 없음
	} //기본생성자
	
	//생성자 선언
	Member(String id, String name, int password, int age){
		//모든 필드를 매개변수로 이용한다.
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}//모든 필드를 매개변수로 둔 생성자
	
	//리턴값이 없는 메소드 선언
	void info() {
		System.out.println("아이디 : "+id);
		System.out.println("이름 : "+name);
		System.out.println("비밀번호 : "+password);
		System.out.println("나이 : "+age);
	}//info메소드
	
	//리턴값은 없고 매개변수가 있는 메소드 선언
	void update(String name) {
		this.name = name;
		System.out.println(name);
	}//update메소드
	
	//리턴값이 있는 메소드 선언
	String myName() {
		return name;
	}//myName메소드
}
