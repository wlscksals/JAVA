package CH16;

import java.util.Objects;

class C03Simple{
	private int id;
	C03Simple(int id){
		this.id = id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple)obj;
			return this.id == down.id;
		}
		return false;
	}
	
}

public class C03ObjcetHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C03Simple ob1 = new C03Simple(1);
		System.out.println(ob1);
		System.out.printf("%x\n",ob1.hashCode());
		
		C03Simple ob2 = new C03Simple(-32);
		System.out.println(ob2);
		System.out.printf("%x\n",ob2.hashCode());
		
		C03Simple ob3 = new C03Simple(1);
		System.out.println(ob3);
		System.out.printf("%x\n",ob3.hashCode());
		
		System.out.printf("%x\n",System.identityHashCode(ob1));
		System.out.printf("%x\n",System.identityHashCode(ob2));
		System.out.printf("%x\n",System.identityHashCode(ob3));

	}

}
