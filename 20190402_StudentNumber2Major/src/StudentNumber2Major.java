import java.util.*;

public class StudentNumber2Major {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�й��� �Է��ϼ���>>");
		String number = sc.nextLine();//�й� �Է�
		
		char grade = number.charAt(0);
		char ban = number.charAt(1);
		
		switch(grade) {
		case '1': case '2': switch(ban) {
			case '1': case '2': System.out.println("���̵�����Ʈ�����"); break;
			case '3': case '4': System.out.println("���̵�����ַ�ǰ�"); break;
			case '5': case '6': System.out.println("���̵������ΰ�");
		}
		break;
		case '3':
			switch(ban) {
				case '1': case '2': System.out.println("���ͷ�Ƽ��̵���"); break;
				case '3': case '4': System.out.println("���̵������ΰ�"); break;
				case '5': case '6': System.out.println("���̵�����ַ�ǰ�");
						} break;
		}
		//�а� ���
		//   �г��� 1,2�̸�
		//    ���� 1,2�̸� "���̵�����Ʈ�����"
		//    ���� 3,4�̸� "���̵��ַ�ǰ�"
		//    ���� 5,6�̸� "���̵������ΰ�"
	    //   �г��� 3�̸�
		//    ���� 1,2�̸� "���ͷ�Ƽ��̵���"
		//    ���� 3,4�̸� "���̵������ΰ�"
		//    ���� 5,6�̸� "���̵��ַ�ǰ�"

	}

}
