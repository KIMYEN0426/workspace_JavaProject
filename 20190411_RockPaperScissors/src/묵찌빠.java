/*import java.util.Random;
import java.util.Scanner;

public class ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] pae = {"��", "��", "��"};
	int previous=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���������� ���� ����!");
		while(true) {
		System.out.print("��(1) ��(2) ��(3) ��(0) �� �ϳ��� ������>>"); //������� �Է��� �޴´�.
		int input = sc.nextInt();
		if(input==0) {
			break;
		}
		int computer = makeComputer(); //��ǻ���� �и� ������.
		
		int result = compare(input, computer);
		
		//����ڿ� ��ǻ���� �и� ������.
	    System.out.println("�����: "+pae[input-1]+"\t��ǻ��: "+pae[computer-1]);
		
		switch(result) {
		case -1: System.out.println("����ڰ� ��"); continue;
		case 0: switch(previous) {
			case -1: System.out.println("����ڰ� ��"); break;
			case 1: System.out.println("����ڰ� �̱�"); break;
		} break;
		case 1: System.out.println("����ڰ� �̱�");continue;
		}
		//����� �������.
		previous = result;
		
		}
		
	}

	private static int compare(int input, int computer) {
		if((input+1)%3==computer) {
			return -1;
		}
		else if(input==computer) {
			return 0;
		}
		else {
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		
		int computer = random.nextInt(3-1+1)+1;
		
		return computer;
	}

}*/


import java.util.Random;
import java.util.Scanner;

public class ����� {

	public static void main(String[] args) {
		boolean WinPlayer=false;
		boolean Win = false;
		String[] pae = {"����", "����", "��"};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���������� ���� ����!");
		while(true) {
		System.out.print("����(1) ����(2) ��(3) ��(0) �� �ϳ��� ������>>"); //������� �Է��� �޴´�.
		int input = sc.nextInt();
		if(input==0) {
			break;
		}
		int computer = makeComputer(); //��ǻ���� �и� ������.
		
		int result = compare(input, computer);
		//����ڿ� ��ǻ���� �и� ������.
	    System.out.println("�����: "+pae[input-1]+"\t��ǻ��: "+pae[computer-1]);
		
		if(result == -1) {
			WinPlayer = false;
			Win = true;
		}
		else if(result==0) {
			if(Win == true) {
				if(WinPlayer == true) {
					System.out.println("�̱�");
				}else {
					System.out.println("��");
				}
			}else {
				
			}
		}else {
			WinPlayer = true;
			Win = true;
		}
		//����� �������.
		}
			
		
	}

	private static int compare(int input, int computer) {
		if((input+1)%3==computer%3) {
			return -1;
		}
		else if(input==computer) {
			return 0;
		}
		else {
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		
		int computer = random.nextInt(3-1+1)+1;
		
		return computer;
	}

}
