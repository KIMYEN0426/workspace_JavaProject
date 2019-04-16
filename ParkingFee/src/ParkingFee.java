import java.util.*;
//분을 입력받아 최초 30분은 2000원 10분당 1000원 주차요금 출력
//5->2000원, 30->2000원, 41->4000원
public class ParkingFee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int fee;
		int minute = sc.nextInt();//분 입력받기	 
		if(0<=minute&&minute<=30) {
			fee=2000;
		}
		else {
			int ten = minute/10;
			int il = minute %10;
			fee =(ten-1)*1000;
			if(il>=1) {
				fee+=1000;
			}
		}
		
		System.out.println("요금 : "+fee);
		//0이상 30분 이하면 2000원
		//10으로 나누고 나머지가 있다면 몫에 1을 더한 후 1000을 곱해 요금에 더한다.
		
	}*/
		
		/*int fee=1500;
		int minute=sc.nextInt();
		
		minute=minute-30;
		if(minute>30) {
			fee+=(minute/10)*1000;
		}
		else if(minute%10!=0) {
			fee+=1000;
		}
		
		
		System.out.println(fee);*/
		
		int fee = 1500;
		int minute = sc.nextInt();
		
		
 }
}
