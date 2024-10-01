package CH13;
//매서드 오버라이딩(함수 재정의)
//상속관계를 전제로 상위클래스의 메서드를 하위클래스가 재정의(고쳐사사용)하는것을 허용한 문법
//메서드의 헤더부분은 동일하게 두고 본체({})의 로직을 다양하게 둠으로써(다형성) 같은 함수를
//상위클래스로 부터 물려받더라도 각 하위클래스마다 다양한 형태의 결과물을 만들어낼수 있다


//오버로딩 vs 오버라이딩 차이

//오버로딩 
//	: 헤더
//: 개발자의 편의성에 중점(함수 이름 단일화)
//	: 상속전제 x

//오버라이딩 
//	: 본체(Body)
//	: 다형성
//: 상속전제 o

class Animal{
	void sound() {System.out.println("소리를 낸다.");}
}

class Dog extends Animal{
	void sound() {System.out.println("멍멍 소리를 낸다.");}
}


class Cat extends Animal{
	void sound() {System.out.println("야옹 소리를 낸다.");}
}




public class C03OverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Animal();
		Dog poppi = new Dog();
		Cat yammi = new Cat();
		poppi.sound();
		yammi.sound();
		
		
		System.out.println("----------------");
		//Upcasting..   //상위 객체에 하위 객체를 연결하는 경우
		ani = poppi;   // ani(부모 클래스) = poppi(자식 클래스)를 연결  상위에서 하위 객체를 연결
		ani.sound();
		ani = yammi;
		ani.sound();
	}

}
