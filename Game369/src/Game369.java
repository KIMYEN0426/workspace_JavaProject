//1~99����
//���ڿ� 3,6,9�� ������ "¦"�� �ƴϸ� ���ڸ� ����Ѵ�.
public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=99; i++) {
			String numstring = Integer.toString(i); //���� -> ���ڿ�
			//�ϳ��� ���� '3' �Ǵ� '6' �Ǵ� '9'�� ������ ����.
			int count = count369(numstring);
			if(count==0) {
				//����� 0�̸�, �׳� ���� ���
				System.out.println(i);
			}
			else {
				for(int j = 0; j<count; j++) {
					//�ƴϸ�, ������ '¦' ���
					System.out.print("¦");
				}
				System.out.println();
			}
		}
	}
	private static int count369(String numstring) {
		//0~length-1����
		//���ڸ� �ϳ��� ���ϰ�
		//�� ���ڰ� '3'�Ǵ� '6' �Ǵ� '9'�̸� ¦
		int count=0;
		for(int i=0;i<numstring.length();i++){
			char ch = numstring.charAt(i);
			if(ch=='3'||ch=='6'||ch=='9') {
				count++;
		 }
		}
		return count;
	}
}
