package testing;

public class MyClassImpl implements MyInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(String s) {
		// TODO Auto-generated method stub

	}
	 public static void main(String[] args) {
	 MyClassImpl impl = new MyClassImpl();
     System.out.println(impl.reserveString("Lars Vogel"));
	 }
}
