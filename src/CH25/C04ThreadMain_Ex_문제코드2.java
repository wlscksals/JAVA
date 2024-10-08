package CH25;

class IncrementThread2 implements Runnable {
	private static int counter = 0;

	//lock object설정(임계영역 접근 여부를 판단하는 기준)
	private static final Object lock = new Object();
	
	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			// 임계 영역 지정 - 하나의 스레드가 들어오면 다른 스레드의 접근이 제한되는 영역
			synchronized(lock) {
				counter++; // 공유변수값증가
				System.out.println(Thread.currentThread().getName() + "s counter : " + counter);
		
				lock.notifyAll(); //다른 스레드에게 점유권한 양보 
				
				if(i<99999) {
					try {
						lock.wait(5); // i가 99999이하(반복문을 벗어나지 않을때)잠깐 대기	
									 // 다른 스레드가 1증가하고 나올때까지 대기 상태
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		}
	}
}
public class C04ThreadMain_Ex_문제코드2 {

	public static void main(String[] args) throws InterruptedException {

		IncrementThread2 incrementThread1 = new IncrementThread2();
		IncrementThread2 incrementThread2 = new IncrementThread2();
		IncrementThread2 incrementThread3 = new IncrementThread2();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);
		Thread thread3 = new Thread(incrementThread3);
		
		thread1.setName("TH1");
		thread2.setName("TH2");
		thread3.setName("TH3");

		thread1.start();
		thread2.start();
		thread3.start();

		//메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join();
		thread2.join();
		thread3.join();

		System.out.println("Final value: " + incrementThread1.getCounter());

	}
}
