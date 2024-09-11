package Ch02;

public class C04자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수
		// byte 	1byte 	8bit => -128 ~ 127
		// short 	2byte 	16bit => -32768 ~ 32767
		// char 	2byte 	16bit => 0~65535
		// int		4byte(기본자료형) 32bit => +-21억
		// long 	8byte	64bit => 많다
				
		// 실수
		// float	4byte	지수, 가수부
		// double	8byte(기본자료형) 지수,가수부
				
		// 원시타입 자료형 : 공간이 필요하고 필요한 값을 저장 ex) byte,short,char,int,long,float,double
		// 참조 자료형 : 위치값 ex) string
				
		//문자(단일문자)
		
		
		
//		// 정수 int - 4byte 정수 부호 o
//		
//		int n1 = 0b10101101;
//		int n2 = 173;
//		int n3 = 0255;
//		int n4 = 0xad;
//		System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);
		
//		//byte n5 = -129; //상수풀에서 -129는 대입가능 하지만 byte에 -129를 넣는 것이 문제 -129는 int값(넓은)을  byte(작은)로 옮겨지는 과정에서 문제
//		byte n5 = (byte) -129 //강제 형변환
//		System.out.println(n5);
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
////		byte n9 = 129; //
////		System.out.printf("%d\n",n9);
//		System.out.println(0b10101101); // 양수???
//		System.out.printf(Integer.toBinaryString(-129));
//		// 129를 4byte 에 2진수로 넣으면 00000000 00000000 00000000 10000001
//		// 음수로 변형 1111111 1111111 11111111 11111111 01111111 
		
		
//		// 정수 short - 2byte 정수 부호 o | char - 2byte 정수 부호 x 양수만
//		
//		char n1 = 65535;	//(0~2^16 -1) (0~65535)
//		short n2 = 32767;	//(-2^15 ~ +2^15 - 1)(-32768 ~ +32767)
//		
//		char n3 = 60000;
//		//short n4 = n3; //문제발생... 왜?? 2byte 사이즈는 같지만 범위가 다르기 때문
		
//		// 정수 long - 8byte 정수 부호 O
//		
//		long n1 = 10;
//		long n2 = 20;
//		
//		// L,l (리터럴접미사) : long 자료형 사용하여 값 저장
//		long n3 = 10000000000L; 
//		long n4 = 10000000000L;
		
//		//실수 
//		// 유리수와 무리수의 통칭
//		// 소숫점이하값을 가지는 수 123.123
//		// folat :
//		// double :
//		
//		// 정밀도 확인
//		float n1 = 0.123456789123456789F;//f,F:float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		
		char ch1 = 'a';
		System.out.println(ch1);
		System.out.println((int)ch1); // 01100001
		
		char ch2 = 98;
		System.out.println(ch2);
		System.out.println((int)ch2); //011000010
		
		char ch3 = 'b'+1;
		System.out.println(ch3);
		System.out.println((int)ch3); // 011000011
		
		int ch4 = 'c'+2;
		System.out.println((char)ch4);
		System.out.println(ch4); // 011000011
		
		char ch5 = 0xac00;
		char ch6 = 44035;
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(0b00001111);
		System.out.println((char)0b00001111);
		
		System.out.printf("%c \n", '\uac00');
		
		
		// boolean : 논리형(true,false 저장)
		String name = "홍길동";
		String name1 = "홍길동";
		System.out.println();
	}

}
