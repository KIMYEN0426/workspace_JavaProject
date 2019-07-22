import java.util.Scanner;
import java.util.Random;

public class UpDown {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	Random random = new Random();
	int rNumber = random.nextInt(100)+1;
	
	while(true) {
		System.out.println("수를 입력하세요>>");
		int input = sc.nextInt();
		if(rNumber<input) {
			System.out.println("Down");
		}
		else if(rNumber>input) {
			System.out.println("Up");
		}
		else{
			System.out.println("정답");
			break;
		}
	}
	}
}
