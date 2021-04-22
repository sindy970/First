package day15;

import java.util.*;

//Service 클래스의 주 목적 : 처리를 담당하는 클래스
//비즈니스 클래스라고도 부른다.
public class BankService {
	// 입금과 출금 기능을 하는 클래스
	Scanner sc = new Scanner(System.in);

	// 입금처리를 위한 메소드 선언
	// ArrayList를 받아와서 해당 계좌 찾기
	/*
	 * 메소드 이름 :listDeposit 매개변수 : bankList 리턴 : bankList (Main Class가 가장 최신의 데이터를
	 * 가져야 하기 때문에 리턴을 줘야 한다.)
	 * 
	 */
	List<BankDTO> listDeposit(List<BankDTO> bank1) {
		// 입금 : 계좌번호 조회 후 계좌에 넣기
		System.out.print("계좌 : ");
		String account = sc.next();

		System.out.print("입금액 : ");
		int deposit = sc.nextInt();

		for (int i = 0; i < bank1.size(); i++) {
			if (account.equals(bank1.get(i).getAccountNumber())) {
				int balance = bank1.get(i).getBalance() + deposit;
				bank1.get(i).setBalance(balance);
				System.out.println("현재 잔액 : " + bank1.get(i).getBalance());
			} else {
				System.out.println("없는 계좌 입니다.");
			}
		} // for

		return bank1;
	}// listDeposit

	List<BankDTO> listWithdraw(List<BankDTO> bank2) {
		// 출금 :계좌와 출금액을 입력받은 후 해당 계좌 찾기
		System.out.print("계좌 : ");
		String account = sc.next();

		System.out.print("입금액 : ");
		int withdraw = sc.nextInt();

		for (int i = 0; i < bank2.size(); i++) {
			if (account.equals(bank2.get(i).getAccountNumber())) {
				if ((bank2.get(i).getBalance() - withdraw) < 0) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔액 : " + bank2.get(i).getBalance());
				} else {
					int balance = bank2.get(i).getBalance() - withdraw;
					bank2.get(i).setBalance(balance);
					System.out.println("현재 잔액 : " + bank2.get(i).getBalance());
				} // if-else
			} else {
				System.out.println("없는 계좌 입니다.");
			}
		} // for
		return bank2;
	} // listDeposit
}
