import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	while(true) {
		System.out.println("입력하세요>>");
		String input = sc.nextLine();
		
		if(input.equals("exit")) {
			System.out.println("종료");
			break;
		}
		
		System.out.println(input);
	}
	
		

	}

}
