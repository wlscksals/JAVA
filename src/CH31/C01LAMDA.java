package CH31;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private int age;
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//toString

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
}

public class C01LAMDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList();
		list.add(new Person("홍길동",55));
		list.add(new Person("남길동",45));
		list.add(new Person("서길동",35));
		
		list.sort((a,b)->{return a.getAge()-b.getAge();});
		
		for(Person person : list) {
			System.out.println(person);
		}

	}

}
