package CH25;

public class C01TheadMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Thead : 실 (코드 실행 순서 )
		
		for (int i = 0; i<5 ; i++) {
			System.out.println("TASK01..");
		}
		for (int i = 0 ; i<5 ; i++) {
			System.out.println("TASK02..");
			Thread.sleep(500);
		}

	}

}
