import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		int n;
				
		do {
			System.out.print("n�� �� : ");
			n = sc.nextInt();
		}while(n<=0);
		
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum+=i; //sum = sum + i;
		}
		System.out.println("1���� "+n+"������ ���� "+ sum +"�Դϴ�.");

	}

}
