import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		int num;
		do {
			System.out.print("���� ������ : ");
			num = sc.nextInt();
		}while(num<=0);
		
		for(int i=num; i>=0; i--) {
			System.out.println(i);
		}

	}

}
