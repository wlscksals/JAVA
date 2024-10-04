package CH31;

//덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스 정의
interface Calculator {
int calculate(int num1, int num2);
}

public class C03LAMDA {

	public static void main(String[] args) {
		//덧셈
		Calculator add = (n1,n2)->{return n1+n2;};
		System.out.println(add.calculate(3, 7));
		//뺄셈
		Calculator sub = (n1,n2)->{return n1-n2;};
		System.out.println(sub.calculate(10, 20));
		//곱셈
		Calculator mul = (n1,n2)->{return n1*n2;};
		System.out.println(mul.calculate(5, 20));
		//나눗셈
		Calculator div = (n1,n2)->{return n1/n2;};
		System.out.println(div.calculate(100, 20));
	}

}
