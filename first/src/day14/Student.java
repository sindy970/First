package day14;

//public = 누구나, 공공의 의 의미를 가진다.
public class Student {
	/*
	 * 접근 제한 자 : public, default, protected, private
	 * 
	 * public :누구나 접근 가능, 다른클래스에서 접근하여 객체로 사용 가능하다.
	 * 
	 * private : 클래스 내에서만 접근이 가능함, 다른 클래스에서는 접근 불가능 : 앞으로 필드에 붙여서 많이 사용, 보안을 위해 많이
	 * 사용 : 다른클래스에서 필드에 직접 접근을 못하도록 하기 위해 사용함
	 */
	// 필드 선언
	private String phone; // int로 선언지 맨 앞에 0이 인식이 안됨
	private String name, address;

	// private필드선언
	// private필드를 사용하기 위해 매개변수를 사용함
	// 직접 접근을 막기 위해 매개변수로 간접 접근을 시킨다.

	// 기본생성자 선언
	Student() {

	}

	// 모든 필드를 매개변수로 하는 생성자 선언
	Student(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	
	// 필드는 private로 선언하고
	// get메소드 set메소드를 선언하여 이 메소드를 통해
	// 필드값을 변경하고 가져오는데 활용
	//필드에 직접 접근이 아닌 간접접근을 하자
	
	//Getter/Setter 선언 방식
	//마우스 오른쪽버튼 -> 소스 -> 제너럴겟터/셋터 ->원하는 필드 선택
	
	//get/set + 필드명 의 규칙을 가지면서 생성된다.
	//Getter : 필드값을 가져다 쓸 떄 사용됨
	public String getPhone() {
		return phone;
	}

	//Setter : 필드값을 바꿀 때 사용된다.
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	
	
	
}
