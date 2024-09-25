package CH13;

//문제 : https://cs-ssupport.tistory.com/84

class Pen{
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

class Sp extends Pen {
	private int width;
}

class Bp extends Pen{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

class Fp extends Pen{
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void refill(int n) {setAmount(n);}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
 