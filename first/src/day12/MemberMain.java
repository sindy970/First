package day12;

public class MemberMain {

	public static void main(String[] args) {
		//Member클래스를 이용하는 main클래스	
		Member ber = new Member();
		
		ber.age = 10;
		ber.id = "아이디1";
		ber.name = "이름1";
		ber.password = 1234;
		
		ber.info();
		ber.update("이름2");
		System.out.println(ber.myName());
		
		Member ber2 = new Member("아이디2","이름2",1234,20);
				
		ber2.info();
		String aa = ber2.myName();
		System.out.println(aa);
		ber2.update("이름3");
	}

}
