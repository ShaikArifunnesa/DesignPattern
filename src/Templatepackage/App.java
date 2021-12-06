package Templatepackage;

public abstract class App {
	
	public final void run()
	{
		login();
		select();
		dotransaction();
		success();
	}
	
	protected abstract void login();
	protected abstract void select();
	protected abstract void dotransaction();
	protected abstract void success();
}
