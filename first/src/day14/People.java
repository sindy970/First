package day14;

public class People {
	//private로 필드 선언
	private String name, rNumber, address;
	private int age;
	
	//기본 생성자 선언
	People(){
		
	}
	
	//마우스 오른쪽버튼 -> 소스 -> 제너럴컨스트럭톨 유징 필드 => 생성자 선언해줌
	//모든 필드를 매개변수로 이용하는 생성자 선언
	People(String name, String rNumber, String address, int age){
		this.name = name;
		this.rNumber = rNumber;
		this.address = address;
		this.age = age;
	}

	//Getter/Setter 선언
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getrNumber() {
		return rNumber;
	}

	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//toString메소드 : 객체의 필드값을 정돈해줌, 객체만 선언해도 해당 객체의 각 필드값을 정돈해준다.
	@Override
	public String toString() {
		return "People [name=" + name + ", rNumber=" + rNumber + ", address=" + address + ", age=" + age + "]";
	}
	
	
		
	}