package CH09;

class C01Person{
	String name;
	private int age;
	String addr;

	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	

	//생성자 함수 우클릭 
//	C01Person(String name,int age,String addr){
//		this.name = name;
//		this.age = age;
//		this.addr = addr ;
//	}
	
	//getter and setter 
//	public int getAge() {
//		return this.age;
//	}
//	public String getAdrr() {
//		return this.addr;
//	}
//	public String getname() {
//		return this.name;
//	}
//	
//	
//	
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}
	
	
}

public class C01정보은닉 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정보 은닉?
		//클래스 접근 한정자
		// public 모든 클래스에서 접근 가능
		// protected :
		
//		C01Person hong = new C01Person("홍길동",50,"대구");
//		// hong. age가 private로 인해 안보임
//		int age = hong.getAge();
//		hong.setAddr("울산");
	}

}
