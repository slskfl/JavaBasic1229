import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
				
		do {
			System.out.print("���� ������ : ");
			num = sc.nextInt();
		}while(num<=0);
		
		int factorial = 1;
				
		for(int i=1; i<=num; i++) {
			factorial = factorial*i; // factorial*=i;
		}

		System.out.println("1����"+num+"������ ���� "+factorial+"�Դϴ�.");

	}

}
