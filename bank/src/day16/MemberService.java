package day16;

import java.util.*;

public class MemberService {

	Scanner sc = new Scanner(System.in);

	// 전체 회원 조회 기능
	void allMemberList(List<MemberDTO> allMemberList) {
		for (int i = 0; i < allMemberList.size(); i++) {
			System.out.println(allMemberList.get(i));
		}
	}// allMemberList

	// 로그인 기능 : ID, 비밀번호가 모두 맞으면 아이디 출력 OR 하나라도 틀리면 "아이디 또는 비밀번호가 맞지 않습니다." 출력
	void login(List<MemberDTO> login) {

		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();

		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();

		for (int i = 0; i < login.size(); i++) {
			if (id.equals(login.get(i).getId()) && password.equals(login.get(i).getPassword())) {
				System.out.println(login.get(i).getId() + "님 환영합니다.");
			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			} // if
		} // for

	} // login

	// 전화번호 변경기능
	List<MemberDTO> newPhoneNumber(List<MemberDTO> newPhoneNumber) {
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();

		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();

		for (int i = 0; i < newPhoneNumber.size(); i++) {
			if (id.equals(newPhoneNumber.get(i).getId()) && password.equals(newPhoneNumber.get(i).getPassword())) {
				System.out.print("변경하는 전화번호를 입력하세요 : ");
				String phoneNumber = sc.next();

				// 기존 전화번호를 입력받은 전화번호로 변경
				newPhoneNumber.get(i).setPhoneNumber(phoneNumber);
			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			} // if
		} // for
		return newPhoneNumber;
	} // newPhoneNumber

}
