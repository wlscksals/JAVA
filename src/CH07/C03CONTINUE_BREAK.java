package CH07;

import java.util.Scanner;

public class C03CONTINUE_BREAK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BREAK
		
		
		// -1일 입력하기 전까지 계속 정수값을 받아 누적 합 계산
		Scanner sc = new Scanner(System.in); //ctrl+shift+O 
//		int n;
//		int sum = 0;
//		while(true) {
//			System.out.println("정수를 입력하시오.(-1: Stop)");
//			n = sc.nextInt();
//			if(n==-1)
//				break;
//			sum+=n;
//		}
//		System.out.println("sum:" + sum);
		
		// 전체 구구단 출력(7 X 7 = 49 까지만 출력)
//		int dan = 2;
//		while(dan<=9) {
//			int i = 1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				++i;
//				if(dan == 7 && i == 8) {
//					break;
//				}
//			}
//			System.out.println();
//			++dan;
////			if(dan == 8) {
////				break;
////			}
//		}
		
//		boolean isExit = false;
//		int dan = 2;
//		while(dan<=9) {
//			int i = 1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				++i;
//				if(dan == 7 && i == 8) {
//					isExit = true;
//					break;
//				}
//			}
//			System.out.println();
//			if(isExit) {
//				break;
//			}
//			++dan;
		
//		// :Exit 이용
//		int dan = 2;
//		Exit:
//		while(dan<=9) {
//			int i = 1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				++i;
//				if(dan == 7 && i == 8) {	
//					break Exit;
//				}
//			}
//			System.out.println();
//	
//			++dan;
//			
//
//		}
		
		

		//CONTINUE
		// 1부터 10까지의 수중의 3의 배수를 제외한 합 출력
		
		int i= 0;
		int sum =0;
		while(i<=9) {
			i++;
			if(i%3 == 0) {
				continue;
			}
			
			
			System.out.println("i:"+i);
			sum+=i;
		}
		System.out.println("sum:"+ sum);
	}

}
