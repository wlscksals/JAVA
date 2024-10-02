package CH25;

public class C03Worker1 implements Runnable {
	
	C03GUI gui;
	
	
	public C03Worker1(C03GUI gui) {
		this.gui = gui;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
			gui.area1.append("TASK01...\n");
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace(); // catch가 interrupt를 받고 다시 반복하지 않게 break
				break;
			}
		}
		
	}
}
