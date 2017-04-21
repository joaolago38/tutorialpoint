package testing;

public class D implements A, B{
	@Override
    public void m() {A.super.m();}
}
