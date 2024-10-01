package CH15;

class iTV{
	private int size;
	
	

	public iTV(int size) {
		this.size = size;
	}



	public int getSize() {
		return size;
	}
	
}


class ColorTV extends iTV{
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	

	public void printProperty(){
		System.out.println(getSize() +"인치 "+ color +"컬러");
	}
}

class IPTV extends ColorTV{
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ip+"주소에 "+getSize()+"인치," +color+"컬러");
	}
	
	
}

public class C04Ex {

	//명품자바 4장 클래스 기본
	//https://security-nanglam.tistory.com/212
	
	//명품자바 5장 상속
	//https://security-nanglam.tistory.com/215
	
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		   
		   IPTV ipTV = new IPTV("192.1.12",32,2048);
		   ipTV.printProperty();
		   
	}
}
