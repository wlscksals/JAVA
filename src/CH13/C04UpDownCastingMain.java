package CH13;

// 암시적 형변환 (자동형변환)

class Super{
	int n1;
}

class Sub extends Super{
	int n2;
}


public class C04UpDownCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// No Casting
		Super ob1 = new Super();
		ob1.n1 = 100;
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 40;
		
		//UpCasting(상위 클래스형 참조변수 = 하위 클래스형 참소변수)
		Super ob3 = new Sub();
		ob3.n1 = 30;
//		ob3.n2 = 100; 접근불가
		Super ob4 = ob2;
		ob4.n1 = 30;
//		ob4.n2 = 200; 접근불가
		
		// DownCasting(하위클래스형 참조변수 = 상위클래스형 객체),강제 형변환
		// UpCasting을 전제로 확장된(추가된) 멤버에 접근하기 위해 사용		
		//		Sub ob5 = (Sub) new Super(); 오류 
		
//		Sub down = ob3;
		Sub down = (Sub) ob3; 
		down.n1 = 10;
		down.n2 = 20;
	}
}
