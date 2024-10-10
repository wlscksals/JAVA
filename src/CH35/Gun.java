package CH35;

//추상클래스로 처리해서 강제로 
public abstract class Gun {
	public int bullitCnt;
	public int power;
	
	public abstract void fire(Unit unit) ;	
	public abstract void reload(int bullit) ;

}
