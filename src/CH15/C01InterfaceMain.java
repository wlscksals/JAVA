package CH15;

interface Remocon{
	int MAXVOL = 100;
	int MINVOL = 0;
	
	void on();
	void off();
	void setVol(int vol);
}


class Tv implements Remocon{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 켭니다.");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 끕니다.");
	}
	 
}

class Radio implements Remocon{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 켭니다.");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 끕니다.");
	}
	
}


public class C01InterfaceMain {
	
	public static void TurnOn(Remocon controller) {
		controller.on();
	}
	public static void TurnOff(Remocon controller) {
		controller.off();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();
		Radio radio = new Radio();
		TurnOn(tv);
		TurnOn(radio);
		TurnOff(tv);
		TurnOff(radio);

	}

}
