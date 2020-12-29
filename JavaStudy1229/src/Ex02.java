import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 *를 표시할까요? : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=0; i<num; i++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
