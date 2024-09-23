package CH09;

public class C05StringClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java"); //new가 나오면 heap영역
		
		System.out.println("str1 == str2 ?"+(str1==str2)); //str1 과 2는 java라는 상수풀의 문자위치를 가져온다.
		System.out.println("str3 == str4 ?"+(str3==str4)); //str3 과 4는 각각 heap영역에 새로운 java를 생성 하여 위치를 저장
		System.out.println("str1 == str3 ?"+(str1==str3));
		System.out.println("str2 == str4 ?"+(str2==str4));		
		System.out.println("============================"); 
		System.out.println("str1 == str2 ?"+(str1.equals(str2))); 
		System.out.println("str3 == str4 ?"+(str3.equals(str4))); 
		System.out.println("str1 == str3 ?"+(str1.equals(str3)));
		System.out.println("str2 == str4 ?"+(str2.equals(str4)));
	}

}
