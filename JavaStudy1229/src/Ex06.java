import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		Scanner scan = new Scanner(System.in);
		System.out.print("n�� ��: ");
		int num = scan.nextInt();
		int sum=0;
		int i;
		for( i=1; i<num; i++) {
			System.out.print(i);
			System.out.print(" + ");
			sum+=i;
		}
		if (i==num) {
			sum+=i;
			System.out.println(i + " = " + sum);
		}
	}

}
