package CH03;

public class C05TypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 연산식(int 보다 작은 변수자료형(short,char,byte))
		int num1 = 10, num2 = 4;
		
		double dnum = num1/num2;
		double dnum1 = (double)num1/num2;
		double dnum2 = (num1*1.0)/num2;
		double dnum3 = (1.0*num1)/num2;
		System.out.println("dnum:"+ dnum);
		System.out.println("dnum1:"+ dnum1);
		System.out.println("dnum2:"+ dnum2);
		System.out.println("dnum3:"+ dnum3);
		
	}

}
