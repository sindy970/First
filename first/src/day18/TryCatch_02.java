package day18;

public class TryCatch_02 {

	public static void main(String[] args) {
		//나눗셈을 할때 : a/b에서 b가 0이면 발생하는 예외를 확인하고 얘외처리를 할 수 있는 코드 작성
		
		int num , a=10, b=0;
		
		
		try {

			num = a/b; // b가 0이기 때문에 발생하는 예외
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			//catch를 여러개 사용 가능하다.
			System.out.println("다른 예외");
		}
		
		// System.out.println(num);

	}

}
