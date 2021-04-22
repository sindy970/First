package day18;

public class PhoneMain {

	public static void main(String[] args) {
		// 상속
		
		Phone p = new Phone();
		p.company = "회사1";
		p.hangOn();
		
		//CellPhone 클래스 캑체
		CallPhone cp = new CallPhone();
		
		//CellPhone이 가지고 있는 필드 사용
		cp.button = "버튼10개";
		cp.message = "메시지 내용";
		
		//CellPhone 객체로 Phone 필드 사용
		cp.company = "회사2";
		cp.model = "전화기 1ㅣ";
		
		//Phone이 가지고 있는 메소드 호출
		cp.hangOff();
		
		//재정의한 메소드를 효출하면 재정의된 내용만 실행됨
		cp.hangOn();
		
		p.hangOn();
		
		SmartPhone sp = new SmartPhone();
		sp.company = "회사3";
		sp.button = "터치폰";
		sp.type = "5G";
		
		sp.call("여보세요"); //Phone의 메소드
		sp.hangOn(); //CallPhone의 재정의한 메소드
		sp.hangOff(); //SmartPhone이 재정의한 메소드
			
		

	}

}
