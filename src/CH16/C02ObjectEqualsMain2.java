package CH16;

class C02Simple{
	
	int n;
	C02Simple(int n){
		this.n = n;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj;
			return this.n == down.n;
		}
		return false;
//		return super.equals(obj);
	}
	
	
}

class B {
	
}

public class C02ObjectEqualsMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(20);
		C02Simple ob3 = new C02Simple(10);
		B ob4 = new B();
		B ob5 = new B();
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob2.equals(ob3));
		
		System.out.println(ob2.equals(ob4));
		
		System.out.println(ob5.equals(ob4));
	}

}
