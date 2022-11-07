package que7;

public class Main {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2(t1);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		
		
	}

}
