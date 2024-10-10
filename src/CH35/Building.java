package CH35;

public abstract class Building implements ICanFly {
	public int hp;
	public int shield;
	public int ammor;
	
	public Marine getMarine() {
		return null;
	}
	
	public Medic getMedic() {
		return null;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lend() {
		// TODO Auto-generated method stub
		
	}
	public abstract void BuildStructure();			//csv가 관여 (Unit unit)
	public abstract void underAttack(Unit unit);
}
