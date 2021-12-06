package Templatepackage;

public class PhonePay extends App{

	@Override
	protected void login() {
		System.out.println("user login PhonePay Successfully");
		
	}

	@Override
	protected void select() {
		System.out.println("user can select beneficiary");
		
	}

	@Override
	protected void dotransaction() {
		System.out.println("user can do the Transaction");
		
	}

	@Override
	protected void success() {
		System.out.println("Trasaction successfully done");
		
	}
	

}
