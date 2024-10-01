package CH19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C02Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 ~ 45 까지숫자를 6개를 랜덤으로 받아(Random클래스를이용) set에 저장
				//[추가]저장된 set의 오름차순정렬을 해보세요(검색을통해서 해결해봅니다)
				
				Set<Integer> set = new HashSet();
				Random rnd = new Random();
				rnd.nextInt(45);
				int e = 1;
				while(e <= 7) { 
				set.add(rnd.nextInt(44)+1);
				e++;
				}
				
				List<Integer> li = new ArrayList();
				
				for (int el : set) {
					System.out.println(el);
					li.add(el);
				}
				
				Collections.sort(li);
				System.out.println(li);
				set.clear();
				
				for (int el : li) {
					System.out.println(el);
					set.add(el);
				}
				System.out.println("=================");
				set .stream()
					.sorted((a,b)->{return b-a;})
					.collect(Collectors.toList());
				System.out.println(set.stream()
						.sorted((a,b)->{return b-a;})
						.collect(Collectors.toList()));
				
//				for (int el : set) {
//					System.out.println(el);
//				}

	}
}
