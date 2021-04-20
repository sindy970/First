package day16;

import java.util.*;

public class BoardService {
	Scanner sc = new Scanner(System.in);

	// 전체글 목록 조회 처리 메소드
	void allBoardList(List<BoardDTO> allBoardList){
		
		for(int i =0; i<allBoardList.size(); i++) {
			System.out.println(allBoardList.get(i));
		}//for
	}//allBoardList
	
	//글조회
	void boardCheck(List<BoardDTO> boardCheck) {
		System.out.print("글번호 : ");
		int cho = sc.nextInt();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		for(int i=0; i<boardCheck.size(); i++) {
			if(cho == boardCheck.get(i).getbNumber() && password.equals(boardCheck.get(i).getPassword())) {
				System.out.println(boardCheck.get(i));
			}//if 
		}//for
	}//boardCheck
	
	//글수정 
	List<BoardDTO> newContents(List<BoardDTO> newContents){
		System.out.print("글번호 : ");
		int cho = sc.nextInt();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		for(int i=0; i<newContents.size(); i++) {
			if(cho == newContents.get(i).getbNumber() && password.equals(newContents.get(i).getPassword())) {
				System.out.print("수정 할 제목 : ");
				String bTitle = sc.next();
				
				System.out.print("수정 할 내용 : ");
				String bContents = sc.next();
				
				newContents.get(i).setbTitle(bTitle);
				newContents.get(i).setContents(bContents);
				System.out.println(newContents.get(i));
			} 
		}//for
		return newContents;
	}//newContents
	
	//글삭제
	List<BoardDTO> boardRemove(List<BoardDTO> boardRemove){
		System.out.print("글번호 : ");
		int cho = sc.nextInt();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		for(int i=0; i<boardRemove.size(); i++) {
			if(cho == boardRemove.get(i).getbNumber() && password.equals(boardRemove.get(i).getPassword())) {
				boardRemove.remove(i);
			}//if 
		}//for
		return boardRemove;
	}
	
}
