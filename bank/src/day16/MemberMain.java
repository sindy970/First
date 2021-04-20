package day16;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		// 회원가입 프로그램 main클래스
		boolean run = true;
		int cho = 0;
		Scanner sc = new Scanner(System.in);

		// ArrayList 선언
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();

		// MemberDTO의 객체 선언의 형식으로 가능하다.
		// MemberDTO member = null;

		// MemberService 객체 선언
		MemberService ms = new MemberService();

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.회원가입 | 2.전체회원조회 | 3.로그인 | 4.전화번호 변경 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			cho = sc.nextInt();

			switch (cho) {
			case 1:
				// 회원가입
				// MemberDTO객체 선언
				MemberDTO member = new MemberDTO();

				// 회원가입 : 사용자의 ID와 비밀번호,이름,전화번호를 입력받아 ArrayList에 저장하기
				System.out.print("ID를 입력하세요 : ");
				member.setId(sc.next());
				System.out.print("비밀번호를 입력하세요 : ");
				member.setPassword(sc.next());
				System.out.print("이름을 입력하세요 : ");
				member.setName(sc.next());
				System.out.print("전화번호를 입력하새요 : ");
				member.setPhoneNumber(sc.next());

				// member객체의 값들을 ArrayList에 저장하기
				memberList.add(member);
				break;
			case 2:
				// 전체 회원 조회 기능
				ms.allMemberList(memberList);
				break;
			case 3:
				// 로그인 기능
				ms.login(memberList);
				break;
			case 4:
				// 전화번호 변경
				memberList = ms.newPhoneNumber(memberList);
				break;
			case 5:
				// 종료
				run = false;
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
