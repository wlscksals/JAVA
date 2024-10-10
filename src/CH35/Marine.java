package CH35;

public class Marine extends Unit{
	
	int damageVal;
	public Gun myGun;
	
	//마린 객체가 생성 될때
	Marine(){
		myGun = new Rifle();
	}
	
	// 총 교체 
	public void setMygun(Gun gun){
		this.myGun = gun;
	}
	
	
	
	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	void underAttack(int damage) {
		// TODO Auto-generated method stub
		
	}

	void attack(Unit unit) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
