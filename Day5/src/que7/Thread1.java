package que7;

public class Thread1 extends Thread{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		int n=Thread.currentThread().getPriority();
		for(int i=0;i<10;i++) {
			System.out.println("Priority of thraed "+n+" and the thread name is "+name);
		}
				
	}
	
}
