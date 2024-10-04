package CH32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	String name;
	Integer age;
	//생성자
	public Person(){}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}



public class C01STREAMMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5);
	
		System.out.println(list);
		//filter
		List<Integer> list2 = list.stream()
				.filter(n->{return n%2 == 0;})
		.collect(Collectors.toList()); // 리턴형을 리스트로 반환
		
		System.out.println(list2);
		
		List<Integer> list3 = list.stream()
				.filter(n-> n%2 == 1)
				.map(n->n*n)
				.collect(Collectors.toList());
		System.out.println(list3);
		
		List<Person> list4 = Arrays.asList(
				new Person("박효신 어~느새길어진~~~ 그림자를 따라서~",40),
				new Person("김범수탕탕후루 탕!탕! 후루루루루루루 워~~~~~우~~예",45),
				new Person("자이언티",30)
				);
		System.out.println(list4);

		List<Integer> list5 = list4.stream()
//				.map(ob -> ob.getAge())     //.map(ob -> {return ob.getAge();})
				.map(Person::getAge)
				.sorted((a,b)->b-a)  //.sorted((a,b)->{return b-a;})
				.collect(Collectors.toList());
		System.out.println(list5);
		
		List<Integer> list6 = list4.stream()
				.map(Person::getName)
				.map(String::length)
				.sorted((a,b)->b-a)
				.collect(Collectors.toList());
		System.out.println(list6);
		
		List<String> names = Arrays.asList("렝가","티모","카르마","다리우스","김기현");
		List<Integer> ages = Arrays.asList(10,20,30,40,50);
		
		List<Person> list7 = names.stream()
//				.map(Person::new)
				.map(el->{
					return new Person(el,ages.get(names.indexOf(el)));
				}).collect(Collectors.toList());
		System.out.println(list7);
		
		
	}

}
