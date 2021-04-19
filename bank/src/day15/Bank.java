package day15;

public class Bank {
	// 은행 고객에 대한 정보를 정의한 클래스
	// 정보를 다루기 위해 선언하는 클래스 ==> DTO(Data Transfer Object)
	// VO(Value Object), Bean... 등으로 표현한다.

	// 필드선언(private)
	private int clientNumber, balance;
	private String name, accountNumber;

	// 기본생성자 선언
	Bank() {

	}

	// 모든 필드를 매개변수로 하는 생성자 선언
	public Bank(int clientNumber, int balance, String name, String accountNumber) {
		super();
		this.clientNumber = clientNumber;
		this.balance = balance;
		this.name = name;
		this.accountNumber = accountNumber;
	}

	// Getter/Setter 생성
	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance += balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	// toString 선언
	@Override
	public String toString() {
		return "Bank [clientNumber=" + clientNumber + ", balance=" + balance + ", name=" + name + ", accountNumber="
				+ accountNumber + "]";
	}

}
