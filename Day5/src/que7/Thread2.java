package que7;

public class Thread2 extends Thread{

	Thread1 t1;

	public Thread2(Thread1 t1) {
		super();
		this.t1 = t1;
	}
	
	
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		
		for(int i=0;i<10;i++) {
			System.out.println("Priority of thread "+priority+" and the thread name is "+name);
		}
	}
	
}
