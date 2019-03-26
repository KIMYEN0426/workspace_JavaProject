import java.util.Scanner;

public class Page {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
/*	int link, totalpage;
 	totalpage=331;
//		link=page/7;
		
//		if(page%7>0) {
//			link++;
//		}
		
//		System.out.println(link+"페이지가 필요합니다.");
	} */
	

	
	while(true){
		System.out.println("총 몇 개의 페이지인가요?>>");
		String page=sc.nextLine();
		
		if(page.equals("exit")) {
			System.out.println("종료합니다.");
			break;
		}
		
		int ch=Integer.parseInt(page);
		int link=ch/7;
		
		if(ch%7>0) {
			link++;
			System.out.println(link+"페이지가 필요합니다.");
		}
	
	}
	}
}
