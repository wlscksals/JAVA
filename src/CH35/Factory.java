package CH35;

public class Factory extends Building implements ICanFly {

	AddOn addon;
	
	Factory(){
		
	}
	void setAddOn(AddOn addOn) {
		this.addon = addOn;
		
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
	}

	@Override
	public void lend() {
		// TODO Auto-generated method stub
		super.lend();
	}

	@Override
	public void BuildStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void underAttack(Unit unit) {
		// TODO Auto-generated method stub
		
	}

}
