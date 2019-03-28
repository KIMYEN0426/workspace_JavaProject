import java.util.*;

public class UpDownBot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int rNumber = random.nextInt(100)+1; //1~100
		
		while(true) {
		System.out.println(rNumber);
		String my = sc.nextLine();
		
		if(my.equals("up")) {
			rNumber=random.nextInt()%rNumber+rNumber;
		}
		
		else if(my.equals("down")) {
			rNumber=random.nextInt(rNumber);
		}
		
		else if(my.equals("SUCCESS")) {
			System.out.println("¼º°ø!");
			break;
		}
		}
		

	}

}
