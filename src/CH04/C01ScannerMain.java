package CH04;

import java.util.Scanner;

public class C01ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ctrl + shift + o : 자동 import
		//ctrl + shift + f : 자동 fommating
		
		//System.out : 표준 출력 스트림
		//System.in : 표준 입력 스트림
		
		//New Scanner(System.in)
		// 표준 입력장치(키보드)로 부터 전달되는 데이터ㅏ를 받을 수 있는 Scanner객체 생성
		// Scanner sc = new Scanner(System.in)
		// Scanner객체를 main함수내에서 제어(접근,사용) 할 수 있도록 sc변수에 위치정보를 저장		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력:");
		int n1= sc.nextInt( );
//		System.out.println("n1:"+n1);
		int n2= sc.nextInt( );
//		System.out.println("n2:"+n2);
		int n3= sc.nextInt( );
//		System.out.println("n3:"+n3);
		int n4= sc.nextInt( );
//		System.out.println("n4:"+n4);
		
		System.out.printf("%d %d %d %d \n",n1,n2,n3,n4); // 스페이스바를 기준으로 출력
	}

}
