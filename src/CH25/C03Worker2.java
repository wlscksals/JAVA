package CH25;

public class C03Worker2 implements Runnable {
	C03GUI gui;
	
	
	public C03Worker2(C03GUI gui) {
		this.gui = gui;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
			gui.area2.append("TASK02...\n");
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();// catch가 interrupt를 받고 다시 반복하지 않게 break
				break;
			}
		}
		
	}

}
