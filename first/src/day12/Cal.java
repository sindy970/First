package day12;

public class Cal {
	int num1, num2;
	
	//sum1메소드 선언
	void sum1(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		//리턴값 없음
		System.out.println(sum);
		// System.out.println(num1+num2); 한줄로 해결 가능
	}
	
	//sum2메소드 선언
	int sum2(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
}
