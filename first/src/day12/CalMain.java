package day12;

public class CalMain {

	public static void main(String[] args) {
		//Cal클래스를 사용할 main클래스
		
		Cal cal = new Cal();
		
		int val1, val2;
		
		//리턴이 없는 메소드 호출
		System.out.println("리턴값이 없는 메소드 호출");
		cal.sum1(10,20);
		
		//리턴값이 있는 메소드 호출
		System.out.println("리턴값이 있는 메소드 호출");
		val1 = cal.sum2(10, 20);
		System.out.println(val1);
		
		

	}

}
