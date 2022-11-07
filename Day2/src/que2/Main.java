package que2;

public class Main {
	public int func(String s) {
		int a=Integer.parseInt(s);
		return a;
	}
	public static void main(String[] args) {
		Main m=new Main();
		X x1=m::func;
		System.out.println(x1.convertStringToNumber("100"));
	}

}
