package day18;

public class SmartPhone extends CallPhone{
	String type;
	
	@Override
	void powerOn() {
		System.out.println("스마트폰을 켭니다.");
	}
	
	@Override
	void hangOff() {
		System.out.println("스마트폰 통화 종료");
	}

}
