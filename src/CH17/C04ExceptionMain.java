package CH17;

public class C04ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String str = null;
		str.toString();				// NULL발생
		
		int arr[] = {10,20,30};		// Bound Exception 발생
		Integer.parseInt("a1234");	// Parse Exception 발생
		
		Animal animal = new Dog();
		Cat yummi = (Cat)animal;	// Cast Exception
		} // Catch()를 한번에 가능
		cat
	}

}
