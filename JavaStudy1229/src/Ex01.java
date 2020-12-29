import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
				
		do {
			System.out.print("양의 정숫값 : ");
			num = sc.nextInt();
		}while(num<=0);
		
		int factorial = 1;
				
		for(int i=1; i<=num; i++) {
			factorial = factorial*i; // factorial*=i;
		}

		System.out.println("1부터"+num+"까지의 곱은 "+factorial+"입니다.");

	}

}
