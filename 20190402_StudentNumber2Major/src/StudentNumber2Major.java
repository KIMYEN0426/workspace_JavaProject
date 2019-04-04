import java.util.*;

public class StudentNumber2Major {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번을 입력하세요>>");
		String number = sc.nextLine();//학번 입력
		
		char grade = number.charAt(0);
		char ban = number.charAt(1);
		
		switch(grade) {
		case '1': case '2': switch(ban) {
			case '1': case '2': System.out.println("뉴미디어소프트웨어과"); break;
			case '3': case '4': System.out.println("뉴미디어웹솔루션과"); break;
			case '5': case '6': System.out.println("뉴미디어디자인과");
		}
		break;
		case '3':
			switch(ban) {
				case '1': case '2': System.out.println("인터랙티브미디어과"); break;
				case '3': case '4': System.out.println("뉴미디어디자인과"); break;
				case '5': case '6': System.out.println("뉴미디어웹솔루션과");
						} break;
		}
		//학과 출력
		//   학년이 1,2이면
		//    반이 1,2이면 "뉴미디어소프트웨어과"
		//    반이 3,4이면 "뉴미디어솔루션과"
		//    반이 5,6이면 "뉴미디어디자인과"
	    //   학년이 3이면
		//    반이 1,2이면 "인터랙티브미디어과"
		//    반이 3,4이면 "뉴미디어디자인과"
		//    반이 5,6이면 "뉴미디어솔루션과"

	}

}
