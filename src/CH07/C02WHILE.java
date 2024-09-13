package CH07;

import java.util.Scanner;

public class C02WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2단에서 9단까지 출력
//		int dan = 2; //초기값
//		while(dan<=9) {
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//				i++; 
//			}
//			dan++;
//		}
//		int dan = 9; //초기값
//		while(dan>=2) {
//			int i = 9;
//			while(i >= 1) {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//				i--; 
//			}
//			dan--;
//		}
		
		Scanner sc = new Scanner(System.in);
//		// N M까지의 합구하기
//		System.out.println("9보다 작은 N값을 입력하시오");
//		int N = sc.nextInt();
//		System.out.println("9보다 작은 M값을 입력하시오");
//		int M = sc.nextInt();
//		while(M > 8 || N > 8) {
//			
//			System.out.println("N과 M은 9보다 작아야합니다.");
//			 N = sc.nextInt();
//			 M = sc.nextInt();
//			
//		}
//		int Max = N;
//		int Min = M;
//		if(N < M) {
//			Max = M;
//			Min = N;
//		}
//		int j = 1;
//		while(Min <= Max) {
//			j = 1;
//			while(j <= 9) {
//				System.out.printf("%d * %d = %d\n",Min,j,Min*j);
//				j++;
//			}
//			Min++;
//		}
		
		
		
		//i (행) j(별)
		
		//별찍기(기본높이:4)
		//*****
		//*****
		//*****
		//*****
		
//		int i =1;
//		while(i <= 4) {
//			
//			int j = 0;
//			while(j <5) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println(); // 행증가
//			i++;
//		}
//		
		
		
		//*
		//**
		//***
		//****
		//i = 0; 	j =0
		//i ++		j++
		// i < 4 	j <= i
		
		//****
		//***
		//**
		//*
//		int i = 1;
//		while(i <= 4) {
//			
//			int j = 1;
//			while(j <=i) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println(); // 행증가
//			i++;
//			j =1;
//	
//		}
		
		
		
		
		
		
		
		
		
		
		//   *
		//  ***
		// *****
		//*******
		
		//*******
		// *****
		//  ***
		//   *
		
		
		//   *
		//  ***
		// *****		
		//*******
		// *****
		//  ***
		//   *
		
		//h/2가 상단
		int h = sc.nextInt();
		if (h%2 == 0) {
			int i = 0;
			while(i <= h) {
				if (i <= h/2) {
					int j = 0;
					while (j <=h-i){
						System.out.print(" ");
						j++;
					}
					int k = 1;
					while (k <= h-i) {
						System.out.print("*");
						k+=2;
					}
				}
				System.out.println(" ");
				i++;
			}
		}
		
		//*******
		// *****
		//  ***
		//   *		
		//   *
		//  ***
		// *****		
		//*******
		
		
		
		
		//별찍기(기본높이:h)
		
			
	}

}
