import java.util.*;

public class Nsum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next(); //���� �Է¹ޱ�
		int numberlength = number.length();
		int sum = 0;
		char num;
		
		for(int i = 0; i<numberlength; i++) {
			num = number.charAt(i);
			sum+=num-'0';	//�� �ڸ����� ���� ������
		}
		
		System.out.println("�� �ڸ� ���� ���� �� : "+sum); //���� ���� �������
		
	}

}
