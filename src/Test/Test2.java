package Test;

class Employee{
	public String name;
	private int age;
	private String addr;
	
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", age=" + age + ", addr=" + addr + "]";
//	}
	
	
	
	
}


class Parttimer extends Employee{
	private  int hour_pay;
	
	Parttimer(){
		super(String name,int age,String addr);
	}


//	public int getHour_pay() {
//		return hour_pay;
//	}



	public void setHour_pay(int hour_pay) {
		this.hour_pay = hour_pay;
	}



	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", age=" + age + ", String=" + String + "]";
	}
	
	
}

class R extends Employee{}



public class Test2 {

	public static void main(String[] args) {
	}
	
}