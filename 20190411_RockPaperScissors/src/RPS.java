import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		String[] pae = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("가위바위보 게임 시작!");
		while(true) {
		System.out.print("가위(1) 바위(2) 보(3) 끝(0) 중 하나를 내세요>>"); //사용자의 입력을 받는다.
		int input = sc.nextInt();
		if(input==0) {
			break;
		}
		int computer = makeComputer(); //컴퓨터의 패를 구하자.
		
		int result = compare(input, computer);
		//사용자와 컴퓨터의 패를 비교하자.
	    System.out.println("사용자: "+pae[input-1]+"\t컴퓨터: "+pae[computer-1]);
		
		switch(result) {
		case -1: System.out.println("사용자가 짐"); break;
		case 0: System.out.println("비김"); break;
		case 1: System.out.println("사용자가 이김");
		}
		//결과를 출력하자.
		}
		
	}

	private static int compare(int input, int computer) {
		if((input+1)%3==computer) {
			return -1;
		}
		else if(input==computer) {
			return 0;
		}
		else {
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		
		int computer = random.nextInt(3-1+1)+1;
		
		return computer;
	}

}
