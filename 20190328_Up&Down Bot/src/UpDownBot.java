import java.util.*;

public class UpDownBot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int start = 1;
		int end = 100;
		
		while(true) {
		//int rNumber = random.nextInt(end+1-start)+start; //1~100
		int rNumber = random.nextInt((end+1-start)/2); //<- 최적화
		System.out.println(rNumber);
		String my = sc.nextLine();
		
		if(my.equals("up")) {
			start=rNumber+1;
		}
		
		else if(my.equals("down")) {
			end=rNumber-1;
		}
		
		else if(my.equals("SUCCESS")) {
			System.out.println("정답입니다!!");
			break;
		}
		}
		
	}

}

//makeGuess start~end 까지 랜덤
//input(up/down/정답) (1: 정답, 2: Up, 3: Down)
//up => start 교체, guess 추측

