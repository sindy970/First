package day18;

//Phone의 자식클래스
public class CallPhone extends Phone {
	//필드
	String button;
	String message;
	
	//기본생성자
	CallPhone() {
	
	}
	
	//매개변수 있는 생성자 선언
	CallPhone(String button, String model, String company){
		this.button = button;
		//modetl, company는 CallPhone클래스에 있는 필드가 아니지만 상속받아서 사용가능하다.
		this.model = model;
		this.company = company;	
	}
	
	//메소드 오버로딩 : 메소드 이름은 같지만 매개변수 타입이나 갯수가 다른 것
	
	void sendMessage(String message) {
		System.out.println("메세지 전송" + message);
	}
	
	void sendMessage() {
		System.out.println("매개변수가 없는 메소드");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//메소드 재정의(override) : 상속받은 메소드의 내용을 수정하거나 바꾸는 것
	//		: 메소드 이름은 그대로 유지해야 함.
	// @ = Annotation(어노테이션) 라고 한다.
	@Override
	void hangOn() {
		System.out.println("CellPhone으로 전화를 겂니다.");
		System.out.println("CellPhone 전화");
	}

}
