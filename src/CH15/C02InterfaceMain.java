 package CH15;
 
 interface Tire{
	public void run();
 }
 
 class 한국타이어 implements Tire{
	 public void run(){System.out.println("한국타이어가 굴러갑니다.");}
 }
 
 class 금호타이어 implements Tire{
	 public void run(){System.out.println("금호타이어가 굴러갑니다.");}
 }
 
class Car{
	Tire FL;
	Tire FR;
	Tire BL;
	Tire BR;
	Car(){
		FL = new 한국타이어(); // UpCasting
		FR = new 한국타이어();
		BL = new 한국타이어();
		BR = new 한국타이어();
	}
	void start() {
		FL.run();
		FR.run();
		BL.run();
		BR.run();
	}
}
public class C02InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.start();
		car.FL = new 금호타이어();
		car.BR = new 금호타이어();
		System.out.println();
		car.start();
	}

}
