import java.util.*;

public class Nsum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next(); //숫자 입력받기
		int numberlength = number.length();
		int sum = 0;
		char num;
		
		for(int i = 0; i<numberlength; i++) {
			num = number.charAt(i);
			sum+=num-'0';	//각 자릿수의 수를 더하자
		}
		
		System.out.println("각 자리 수를 더한 값 : "+sum); //더한 값을 출력하자
		
	}

}
