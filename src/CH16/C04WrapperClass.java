package CH16;

public class C04WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing(기본자료형 -> Wrapper Class)
		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("100");
		Integer ob3 = Integer.valueOf("300");
		System.out.println(ob1+ob2+ob3);
		
		//UnBoxing
		int n1 = ob1.intValue();
		int n2 = ob2.intValue();
		int n3 = ob3.intValue();
		System.out.println(n1+n2+n3);
		
		//Auto Boxing
		Integer ob4 = 100; // int 100이 자동으로 Integer로 변형
		int n4 = ob1 + ob2 + ob3; // ob1 ob2 ob3의 자료형은 Integer 자료형인데 연산이 붙으면 int로 자동 Boxing
	}

}
