/*import java.util.Random;
import java.util.Scanner;

public class 묵찌빠 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] pae = {"찌", "묵", "빠"};
	int previous=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("가위바위보 게임 시작!");
		while(true) {
		System.out.print("찌(1) 묵(2) 빠(3) 끝(0) 중 하나를 내세요>>"); //사용자의 입력을 받는다.
		int input = sc.nextInt();
		if(input==0) {
			break;
		}
		int computer = makeComputer(); //컴퓨터의 패를 구하자.
		
		int result = compare(input, computer);
		
		//사용자와 컴퓨터의 패를 비교하자.
	    System.out.println("사용자: "+pae[input-1]+"\t컴퓨터: "+pae[computer-1]);
		
		switch(result) {
		case -1: System.out.println("사용자가 짐"); continue;
		case 0: switch(previous) {
			case -1: System.out.println("사용자가 짐"); break;
			case 1: System.out.println("사용자가 이김"); break;
		} break;
		case 1: System.out.println("사용자가 이김");continue;
		}
		//결과를 출력하자.
		previous = result;
		
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

}*/


import java.util.Random;
import java.util.Scanner;

public class 묵찌빠 {

	public static void main(String[] args) {
		boolean WinPlayer=false;
		boolean Win = false;
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
		
		if(result == -1) {
			WinPlayer = false;
			Win = true;
		}
		else if(result==0) {
			if(Win == true) {
				if(WinPlayer == true) {
					System.out.println("이김");
				}else {
					System.out.println("짐");
				}
			}else {
				
			}
		}else {
			WinPlayer = true;
			Win = true;
		}
		//결과를 출력하자.
		}
			
		
	}

	private static int compare(int input, int computer) {
		if((input+1)%3==computer%3) {
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
