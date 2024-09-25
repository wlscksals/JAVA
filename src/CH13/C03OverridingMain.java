package CH13;
// 매서드 오버라이딩(함수 재정의)
// 상속관계를 


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
		ani = poppi;
		ani.sound();
		ani = yammi;
		ani.sound();
	}

}
