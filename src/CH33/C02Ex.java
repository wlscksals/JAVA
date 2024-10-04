package CH33;

@FunctionalInterface
interface functional{
	int execute(int...args);
}

class Calc{
	functional sum;
	functional sub;
	functional mul;
	functional div;
	Calc(){
		//sum,sub,mul,div 각각에 람다&스트림함수를 적절히 이영해서 기능 구현을 합니다.
		//모든 인자를 받을 수 있는 가변인자 처리로 구현합니다.
		//뺄셈,나눗셈은 큰수에서 작은수로 졍렬(sorted)한 다음 누적 감산 처리(reduce)를 합니다.
	
	
	
	}
}

public class C02Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		System.out.println("합 :"+calc.sum.execute(10,20,30,40,50,60));
		System.out.println("차 :" + calc.sub.execute(1,4,2,5));

	}

}
