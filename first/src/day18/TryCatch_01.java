package day18;

public class TryCatch_01 {

	public static void main(String[] args) {
		/* 예외(Exception) 처리
		 * try {
		 * 실행할 내용
		 * } catch(익셉션이름 e){
		 * 해당 예외(익셉션)가 발생할 경우 실행할 내용
		 * }
		 */
		
		try {
			
			int[] num = new int[3];
			
			num[3] = 10; //익셉셥 발생 => 인덱스 값 초과
			
		} catch(ArrayIndexOutOfBoundsException e) {
			//예외가 발생하면 실행되는 내용
			System.out.println("배열크기 초과");
			e.printStackTrace();
		} finally {
			//옵션 => 생략가능하다.
			System.out.println("예외가 나든 안나든 무조건 여기는 나옵니다.");
			// 예외의 유무랑 상관없이 무조건 실행 된다.
		}
/*		
		int[] num = new int[3];
		
		num[3] = 10; //익셉셥 발생 => 인덱스 값 초과
*/		
		System.out.println("try catch 끝나고");

	}

}
