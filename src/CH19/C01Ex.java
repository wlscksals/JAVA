package CH19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01Ex {
	static Scanner sc = new Scanner(System.in);
	
	public static void func1(List<String> list) {

		
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		//짝수의 값만 입력받는 코드를 작성하세요.
	}
	public static List<String> func2(List<String> list) {
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 필터링해서 리턴하는 함수를 만드세요
		List<String> returndList = new ArrayList();
		for(String arr : list) {
			if(arr.length() >= 5) {
				returndList.add(arr);
			}
		}
		
		
		return returndList;
	}
	public static int func3(List<String> list) {
		//ArrayList에 있는 문자열 중에서 숫자형 데이터만 추출해서 합을 구해보세요
		return 0; 
	}
	
	public static void main(String[] args) {
		List<String> li = new ArrayList();
//		func1(li);
		List<String> returndList =  func2(li);
		int sum =  func3(returndList);
		System.out.println(sum);
	}

}
