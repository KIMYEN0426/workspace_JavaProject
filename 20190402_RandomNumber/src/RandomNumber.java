import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int start=2;
		int end=2
				;
		Random random = new Random();
		int randomNumber = random.nextInt(end+1-start)+start;  //start~end �������� �̱�
		System.out.println(randomNumber);

	}

}
