package suryang.soft.com.calc.test;

public class ApplyCalcTestClass {

	public static void main(String[] args) {
		
		// 3kg, 5kg 봉지가 있다. 최소 봉지를 들고 가려고 한다. 
		// ex)  18kg 배달 시 3kg * 6개를 가져가도 되지만, 
		// 		(5kg * 3개) + (3kg * 1개) 배달 시 더 적은 개수의 봉지를 배달할 수 있다.
		// 정확히 Nkg 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 
		// 그 수를 구하는 프로그램을 작성하시오.

		int nkg = 21; //배달해야 되는 kg
		
		int quotient  = nkg / 15;    // 몫
		int num_5kg = 0;
		int num_3kg = 0;
		
		num_5kg = quotient*15 /5;
		
		int remainder = nkg % 15;    // 나머지
		if(remainder % 3 != 0) {
			remainder = remainder / 5;
			num_5kg = num_5kg + remainder;
		}else {
			num_3kg = remainder / 3;
		}
		
		System.out.println(">>> 5kg 봉지 갯수 : "+num_5kg+" <<<");
		System.out.println(">>> 3kg 봉지 갯수 : "+num_3kg+" <<<");
		
	}

}
