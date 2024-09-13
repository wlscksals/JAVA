package CH04;

import java.util.Scanner;

public class C03ScannerMain {

	public static void main(String[] args) {
		// 이름을 입력하세요? 홍길동
		// 홍길동 님의 나이를 입력하세요?
		// 홍길동 님의 주소를 입력하세요
		// 홍길동 님의 나이는 35세 주소는 대구 광역시 ~ 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 이름을 입력하시오:");
		String name = sc.next();
		System.out.println(name);
		
		System.out.print(name + "의 나이을 입력하시오:");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.print(name +"의 주소를 입력하시오:");
		sc.nextLine();
		String add = sc.nextLine();
		System.out.printf("%s님의 나이는 %d세 주소는 %s 입니다.\n",name,age,add);
		System.out.printf("%s님의 나이는 %d세 주소는 "+ add +"입니다.\n",name,age);
		
		
		
	}

}
