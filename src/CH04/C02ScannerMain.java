package CH04;

import java.util.Scanner;

public class C02ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.printf("정수 입력:");
//		int num1= sc.nextInt( );
//		System.out.println("입력된 정수 값:"+ num1);
//		
//		System.out.printf("실수 입력:");
//		double num2= sc.nextDouble( );
//		System.out.println("입력된 실수 값:"+num2);
//		
//		
//		
//		System.out.printf("문자열 입력:");
//		String str1= sc.next( );
//		System.out.println("str1:"+ str1);
//		System.out.printf("입력:"); // 문자열 입력받기 기능함수,띄어쓰기는 포함하지 않는다.
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		
//		System.out.printf("%s %s %s \n",s1,s2,s3); // 스페이스바를 기준으로 출력
		

//		System.out.print("문자열 입력:");
//		String str2 = sc.nextLine();
//		System.out.print("문자열:" + str2);
		
		
		// 주의! 여러개 값을 받을때 sc.nextLine()주의점
		
		System.out.print("정수값 입력:");
		int n1 = sc.nextInt();
		System.out.println("정수값 : " + n1);
		
		System.out.println("실수 값 입력: ");
		double n2 = sc.nextDouble(); // 버퍼 공간에 엔터키앞에 입력값만 받아온다.
		
		// 여기서 문제 발생!
		// sc.nextLine()을 입력하면 해결 완료!
		System.out.print("문자열 입력: ");
		String str2 = sc.nextLine(); // 앞에서 값을 입력하면 버퍼공간에 enter키를 인식하고 입력을 받는다. 해결방법. 앞에 sc.nextLine을 한번 적어둔다.
		System.out.println("문자열 : "+ str2);
		
		String str = sc.next();
		System.out.println("문자열 : " + str);
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}

}
