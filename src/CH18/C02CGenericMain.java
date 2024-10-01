package CH18;

public class C02CGenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
		System.out.println(ob1);

		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
		
		
	}

}
