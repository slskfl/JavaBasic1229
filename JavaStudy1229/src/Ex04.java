import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카운트업 합니다.");
		int num;
		do {
			System.out.print("양의 정숫값 : ");
			num = sc.nextInt();
		}while(num<=0);
		
		for(int i=0; i<=num; i++ ) {
			System.out.println(i);
		}

	}

}
