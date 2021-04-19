package day15;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		// Bank클래스를 이용하는 main클래스

		int cho, deposit = 0, withdraw = 0, count = 1;
		String name, account;
		boolean run = true;

		Scanner sc = new Scanner(System.in);

		// 객체 선언
		// Bank bank = new Bank();
		// => 컴퓨터 메모리 상에 생성되는 위치과 데이터 참조의 구조 때문에 원하는 값이 안나오고
		// 값이 덮어쓰기가 된다. , 컴퓨터 상의 특징 때문에
		// 반복적으로 값을 받을 경우에는 사용할 객체는 반복문 안에 선언해주는 것이 좋다.
		// Bank bank = null; => 밖에 선언을 원하는 경우 선언 방식

		// 고객 전체를 저장할 list 선언
		List<Bank> bankList = new ArrayList<Bank>();

		while (run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.고객등록(get,set) | 2.고객등록(생성자) | 3.입금 | 4.출금 | 5.고객리스트 | 6.종료");
			System.out.println("-----------------------------------------------------------------------");

			System.out.print("선택> ");
			cho = sc.nextInt();

			switch (cho) {

			case 1:
				// switch - case문 내에서는 선언한 변수들이 공유가 가능하므로 한번만 선언하고 계속 사용 가능하다.
				Bank bank = new Bank();

				// 고객등록(get/set)이용
				System.out.print("이름 : ");
				name = sc.next();

				System.out.print("계좌 : ");
				account = sc.next();

				System.out.print("입금액 : ");
				deposit = sc.nextInt();

				// 입력 받은 값을 Bank클래스에 저장하기
				bank.setName(name);
				bank.setAccountNumber(account);
				bank.setBalance(deposit);

				bank.setClientNumber(count);
				//count = bankList.size()+1; 의 형식으로도 가능하다.
				count++;

				bankList.add(bank);
				break;

			case 2:

				// 고객등록(생성자) 이용
				System.out.print("이름 : ");
				name = sc.next();

				System.out.print("계좌 : ");
				account = sc.next();

				System.out.print("입금액 : ");
				deposit = sc.nextInt();

				bank = new Bank(count, deposit, name, account);

				bank.setClientNumber(count);
				count++;

				bankList.add(bank);
				break;

			case 3:

				// 입금 : 계좌번호 조회 후 해당 계좌에 넣기
				System.out.print("계좌 : ");
				account = sc.next();

				System.out.print("입금액 : ");
				deposit = sc.nextInt();

				for (int i = 0; i < bankList.size(); i++) {
					if (account.equals(bankList.get(i).getAccountNumber())) {
						// bankList.get(i).setBalance(deposit);
						int balance = bankList.get(i).getBalance() + deposit;
						bankList.get(i).setBalance(balance);
						System.out.println("현재 잔액 : " + bankList.get(i).getBalance());
					} 
				}
				break;

			case 4:

				// 출금
				System.out.print("계좌 : ");
				account = sc.next();

				System.out.print("출금액 : ");
				withdraw = sc.nextInt();

				for (int i = 0; i < bankList.size(); i++) {
					if (account.equals(bankList.get(i).getAccountNumber())) {
						if ((bankList.get(i).getBalance() - withdraw) < 0) {
							System.out.println("잔액이 부족합니다.");
							System.out.println("잔액 : " + bankList.get(i).getBalance());
						} else {
							// bankList.get(i).setBalance(-withdraw);
							int balance = bankList.get(i).getBalance() - withdraw;
							bankList.get(i).setBalance(balance);
							System.out.println("잔액 : " + bankList.get(i).getBalance());
						}
					} 

				}
				break;

			case 5:

				// 고객 리스트 출력
				for (int i = 0; i < bankList.size(); i++) {
					System.out.println(bankList.get(i));
				}
				break;

			case 6:

				run = false;
				System.out.println("프로그램 종료");
			}

		}

	}

}
