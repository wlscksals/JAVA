package CH03;

public class C06StringChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 + 문자열
//		
//		System.out.println("문자열1"+"문자열2");
//		System.out.println("문자열1"+"문자열2");		 // 문자열 + 문자열
//		System.out.println("문자열1"+','+"문자열2");	 // 문자열 + 문자 +문자열
//		System.out.println("문자열1"+2+1);			 // 문자열 + 숫자 -> 숫자를 문자로 인식
//		System.out.println("문자열"+','+'!');			 
//		System.out.println(','+'!'+"문자열1");		// 문자와 문자가 만나면 숫자로 변형
//		System.out.println("문자열1"+"문자열2");
//		

		
		// 문자열 -> 숫자형으로 변환(정수)
		// int n1 = "10";
		

		System.out.println("10"+"20"); 		//문자열 연결
		
		int n1 = Integer.parseInt("10");	// 웹개발코드시 폼으로부터 전달받은 값은 다
		int n2 = Integer.parseInt("20");
		System.out.print(n1+n2);
		
		//문자열 -> 숫자형으로 변환(실수)
		
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3+n4);
		
		// short n5 = Short.parseShort("5");
		// short n6 = Short.parseShort("6");
		// System.out.println(n5+n6);
		
		// 숫자열 -> 문자열
		
		int value1 =10;
		double value2 = 3.14;
		
		System.out.println(value1 + value2); 		// 연산
		
		// String str1 = String.valueOf(value1);
		// String str2 = String.valueOf(value2);
		String str1 = value1 + "";
		String str2 = value2 + "";
		
		System.out.println(str1+str2); 				// 문자열 붙이기
	}

}
