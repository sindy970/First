package day16;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		// 게시판 프로그램
		int cho = 0,count=1;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		BoardService bs = new BoardService();
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.글쓰기 | 2.전체글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			cho = sc.nextInt();
			
			switch(cho) {
			case 1:
				//객체 선언
				BoardDTO board = new BoardDTO();
				//글쓰기: 글번호를 제외한 모든 항목 입력받기
				System.out.print("제목 : ");
				board.setbTitle(sc.next());
				System.out.print("비밀번호 : ");
				board.setPassword(sc.next());
				System.out.print("작성자 : ");
				board.setbWriter(sc.next());
				System.out.print("내용 : ");
				board.setContents(sc.next());
				
				board.setbNumber(count);
				
				boardList.add(board);
				break;
				
			case 2:
				
				//전체 글 목록 조회: 등록된 모든 글의 상세정보 출력
				bs.allBoardList(boardList);
				break;
				
			case 3:
				
				//글조회 : 글번호를 입력하면 해당 글의 상세정보 출력
				bs.boardCheck(boardList);
				break;
				
			case 4:
				
				//글수정 : 글번호,비밀번호를 입력하고 맞으면 제목,내용을 수정할 수 있다.
				boardList = bs.newContents(boardList);
				break;
				
			case 5:
				
				//글삭제 : 글번호,비밀번호 입력 후 해당 글 삭제
				boardList = bs.boardRemove(boardList);
				break;
			case 6:
				
				//종료
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		

	}

}
