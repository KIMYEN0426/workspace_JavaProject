import java.util.Scanner;

public class NumberToWeekday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요>>");
		int input = sc.nextInt();
		
		String[] weekdays= {"월","화","수","목","금","토","일"};
		
		System.out.println(weekdays[input-1]+"요일");
		
		/*switch(input) {
			case 1: System.out.println("월요일"); break;
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break;
			case 6: System.out.println("토요일"); break;
			case 7: System.out.println("일요일");
		}*/
	}
}
