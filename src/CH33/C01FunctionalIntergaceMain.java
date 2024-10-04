package CH33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Func1{
	void say(String message);
}

@FunctionalInterface
interface Func2{
	int sum(Integer ...args);
}

@FunctionalInterface
interface Func3{
	List<Integer> createListDesc(int ...args);
}



// 함수형 인터페ㅔ이스를 사용할 거면 인터페이스에 추상메서드를 하나만 만들어둔다. 
public class C01FunctionalIntergaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//01
		Func1 func1 = (message)->{System.out.println(message);};
		func1.say("HELLO WORLD");
		
		//01_1
		Func1 func1_1 = System.out::println;
		func1_1.say("HELLO WORLD2");
		
		//02
		Func2 func2 = (arg)->{
			int sum = 0;
			for(int el: arg) {
				sum += el;
			}
			return sum;};
			
		System.out.println(func2.sum(1,2,48,1564,2,5,46,4532,4,56,42,345,63,1,34,3,12));
	
		//02_2
		Func2 func2_2 = (arg)->{
			return Arrays.stream(arg)
			.reduce(0,(a,b)->a+b);	//reduce(초기값,(a,b)-> 누적합(a+b))
		};
			
		System.out.println(func2_2.sum(1,2,48,1564,2,5,46,4532,4,56,42,345,63,1,34,3,12));
		
		//03
		Func3 func3 = (arg)->{
			return Arrays	.stream(arg)
				.boxed()
				.sorted((a,b)->b-a)				//sort에 인자를 받는 자료형이 없다......box로 렙핑처리
				.collect(Collectors.toList());
		};
		List<Integer> li = func3.createListDesc(1,2,48,1564,2,5,46,4532,4,56,42,345,63,1,34,3,12);
		System.out.println(li);
	}

}
