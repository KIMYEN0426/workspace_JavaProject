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
		
//		System.out.println(link+"�������� �ʿ��մϴ�.");
	} */
	

	
	while(true){
		System.out.println("�� �� ���� �������ΰ���?>>");
		String page=sc.nextLine();
		
		if(page.equals("exit")) {
			System.out.println("�����մϴ�.");
			break;
		}
		
		int ch=Integer.parseInt(page);
		int link=ch/7;
		
		if(ch%7>0) {
			link++;
			System.out.println(link+"�������� �ʿ��մϴ�.");
		}
	
	}
	}
}
