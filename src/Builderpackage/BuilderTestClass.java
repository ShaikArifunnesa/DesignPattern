package Builderpackage;

public class BuilderTestClass {

	public static void main(String[] args) {
		
		//Creating object using Builder pattern
		User user1=new User.UserBuilder()
		.firstName("Alex")
		.lastName("Daddario")
		.age(26)
		.phone("123456789")
		.address("VIZG-1230")
		.build();
	System.out.println(user1);
		
	User user2=new User.UserBuilder()
			.firstName("Ammu")
			.lastName("M")
			.age(30)
			.phone("123456789")
			//.address("VIZG-1230")
			.build();
		System.out.println(user2);
		
		
	}
	

}
