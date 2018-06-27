package suryang.soft.com.calc.test;

public class DivTestClass {

	public static void main(String[] args) {
		
		// 두 정수 a와 b를 입력 받는다.
		// a / b, a % b 를 출력하는 프로그램 작성하세요.
		// a와 b가 주어진다. ( a > 0, b > 0 )
		
		int a = 2;
		int b = 3;
		
		int result1 = a/b; // 몫
		int result2 = a%b; // 나머지
		
		System.out.println(">>> 결과[몫] : "+result1+" <<<");
		System.out.println(">>> 결과[나머지] : "+result2+" <<<");

	}

}
