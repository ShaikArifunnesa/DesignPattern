package Mediatorpacakge;

public class MediatorTestClass {

	public static void main(String[] args) {
		User user1=new User("Alex");
		User user2=new User("John");
		user1.sendMessage("Hi! John!");
		user2.sendMessage("Hi! Alex!");
		
	}

}
