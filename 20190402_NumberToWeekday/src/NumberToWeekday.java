import java.util.Scanner;

public class NumberToWeekday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���>>");
		int input = sc.nextInt();
		
		String[] weekdays= {"��","ȭ","��","��","��","��","��"};
		
		System.out.println(weekdays[input-1]+"����");
		
		/*switch(input) {
			case 1: System.out.println("������"); break;
			case 2: System.out.println("ȭ����"); break;
			case 3: System.out.println("������"); break;
			case 4: System.out.println("�����"); break;
			case 5: System.out.println("�ݿ���"); break;
			case 6: System.out.println("�����"); break;
			case 7: System.out.println("�Ͽ���");
		}*/
	}
}
