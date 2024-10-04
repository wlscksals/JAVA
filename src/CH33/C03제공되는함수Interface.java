package CH33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C03제공되는함수Interface {
	//01  Function<입력 자료, 리턴 자료(반환 자료)>
	public static Function<Integer,Integer> func1 = x->x*x;
	public static Function<Integer,Integer> func1_2 = x->x+x;
	public static Function<List<Integer>,Integer> func1_3 = x->
		x.stream().reduce((sum,b)->sum+b).get();
//		x.stream().reduce()// 컬렉션 stream().reduce() Optional<T> 반환		
//		x.stream().reduce(0,(sum,b)->sum+b); 0을 초기값으로 잡고 get()을 지워도 된다. 왜??
	public static Function<List<Object>,List<Integer>>func1_4 = x-> {
	return	x.stream()
		.filter(el->{return el instanceof Integer;})
		.map(el->(Integer)el ) //map이 없을 경우 리스트의 object을 Integer형으로 변환 할 수 없음
		.collect(Collectors.toList());
	};
	
	//02
	public static Function<Integer,Integer> func2 = func1.andThen(func1_2); //func1 선 처리 func1_2 후 처리
	public static Function<Integer,Integer> func2_2 = func1_2.andThen(func1);
	
	//03
	public static BinaryOperator<Integer> func3 = (x,y)->{return x+y;};
	
	//04
	public static Function<Integer,Function<Integer,Integer>>func4 = x ->y->x+y ; // 4->y -> 4+y , 4->5->4+5
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//01
		System.out.println(func1.apply(10));
		System.out.println(func1_2.apply(5));
		System.out.println(func1_3.apply(Arrays.asList(1,23,5,4,9)));
		
		System.out.println(func1_4.apply(Arrays.asList(1,"1",23,"10",5,4,9,"dfds","aa")));
		
		List<Object> li1 = new ArrayList();
		li1.add(14);li1.add("sdf");li1.add(458);li1.add(7);li1.add(1);li1.add("14");
		List<Integer> li2 = func1_4.apply(li1);
		System.out.println(li2);
		
		//02
		System.out.println(func2.apply(5));
		System.out.println(func2_2.apply(5));
		
		//03
		System.out.println(func3.apply(10,20));
		
		//04
		System.out.println(func4.apply(10).apply(5));
		
	}

}
