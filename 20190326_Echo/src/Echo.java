import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	while(true) {
		System.out.println("�Է��ϼ���>>");
		String input = sc.nextLine();
		
		if(input.equals("exit")) {
			System.out.println("����");
			break;
		}
		
		System.out.println(input);
	}
	
		

	}

}
