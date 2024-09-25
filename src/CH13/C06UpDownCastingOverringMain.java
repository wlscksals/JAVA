package CH13;

class Parent{
	void func1() {System.out.println("Parent func1() CALL!");}
}

class Son extends Parent{
	void func1() {System.out.println("Sound Func1 호출!");}
	// 추가(확장)
	void func2() {System.out.println("Sound Func1 호출!(extends...)!");}
}


public class C06UpDownCastingOverringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent ob1 = new Parent();
		ob1.func1();
		
		Son ob2 = new Son();
		ob2.func1();
		
		Parent ob3 = new Son(); //UpCasting
//		ob3.func2();
		ob3.func1(); // !! 재정의
		
		// Upcasting
		// 상위클래스형 참조변수 = 하위클래스형 객체
		// 자동형변환
		// 상속관계의 모든 클래스로 만든 객체들을 연결할 수 있다.
		// UPCASTING상태에서는 확장된 멤버변수 접근 가능? X -> DOWNCASTING하고 해결
		// UPCASTING상태에서는 확장된 멤버함수 접근 가능? X -> DOWNCASTING하고 해결
		// UPCASTING상태에서는 재정의된 함수에 접근 가능? O
	}

}
