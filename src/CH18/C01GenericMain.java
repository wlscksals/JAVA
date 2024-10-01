package CH18;

class 야채 extends 재료{

	@Override
	public String toString() {
		return "야채 []";
	}
	
}
class 팥 extends 재료{

	@Override
	public String toString() {
		return "팥 []";
	}
	
}
class 슈크림 extends 재료{

	@Override
	public String toString() {
		return "슈크림 []";
	}
	
}
class 피자 extends 재료{

	@Override
	public String toString() {
		return "피자 []";
	}
	
}

class 재료 {
	
}

class 호빵<T extends 재료>{
	private T material;
	public 호빵(T material) {
		this.material = material;
			}
	@Override
	public String toString() {
		return "호빵 [material=" + material + "]";
	}
	

}

public class C01GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		호빵<팥> ob1 = new 호빵<팥>(new 팥());
		System.out.println(ob1);
		호빵<야채> ob2 = new 호빵<야채>(new 야채());
		System.out.println(ob2);
		
		호빵<피자> ob3 = new 호빵<피자>(new 피자());
		System.out.println(ob3);
		
		호빵<슈크림> ob4 = new 호빵<슈크림>(new 슈크림());
		System.out.println(ob4);

	}

}
