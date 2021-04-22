package day18;

public class Phone {
	//상속
	//Phone -> CellPhone -> SmartPhone
	
	String model;
	String company;
	
	//메소드 선언
	void hangOn() {
		System.out.println("전화를 겁니다.");
	}
	
	void hangOff() {
		System.out.println("전호를 끊습니다.");
	}
	
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}

}
