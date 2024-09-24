package CH12;



public class Buyer {
	private int money;
	private int count;

	public Buyer(int money, int count) {
		super();
		this.money = money;
		this.count = count;
	}
	

	public void payment(Seller seller, int money) 
	{
//		   - 1 고객의 보유금액에서 구매할정도의 액수를 차감
		this.money-=money;
//		   - 2 사과장수에게 고객의 보유금액 전달
		int receiveApp =seller.receive(money);			
//		   - 7 고객속성에 전달받은 사과개수 누적
		this.count +=receiveApp;

	}
	
	@Override
	public String toString() {
		return "Buyer [money=" + money + ", count=" + count + "]";
	}
	
}
