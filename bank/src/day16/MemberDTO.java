package day16;

public class MemberDTO {
	// private 필드 선언
	private String id, password, name, phoneNumber;

	// 기본생성자
	MemberDTO() {

	}

	// 모든 필드를 매개변수로 하는 생성자
	public MemberDTO(String id, String password, String name, String phoneNumber) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// Getter/ Setter선언
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// toString 선언
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
