package CH19;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person down = (Person)obj;
			return this.name.equals(down.name)&&this.age == down.age;
		}
		return false;
	}
	
}

public class C02SetMain {
	public static void main(String[] args) {
		Person ob1 = new Person("홍길동",55);
		Person ob2 = new Person("홍길동",33);
		Person ob3 = new Person("홍길동",55);
		
		Set<Person> set = new HashSet();
		set.add(ob1);set.add(ob2);set.add(ob3);
		
		System.out.println("SIZE :" +set.size());
		for(Person el : set)
			System.out.println(el);
	}
}
