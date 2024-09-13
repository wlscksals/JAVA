package CH07;

import java.util.Scanner;

public class C01WHILE {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// N M까지의 합구하기
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Max = N;
		int Min = M;
		if(N < M) {
			Max = M;
			Min = N;
		}
		int sum = 0;
		while(Min <= Max) {
			sum += Min;
			Min++;
			
		}

		
		
		System.out.println(sum);
//		
//		
//		// 1 - R까지 중에 짝수와 홀수 각각의 합
//		int r = sc.nextInt();
//		int i = 1;
//		int even = 0;
//		int odd = 0;
//		while(i <= r) {
//			if (i%2 == 0) { 
//				odd+=i;
//			} else {even+=i;}
//			
//			i++;
//		}
//			System.out.println("even :"+ even + "\nodd:" + odd);
			

	}
		

}
