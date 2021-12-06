package Builderpackage;

public class User {
	
	//All final Variables
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	
	// All getter , no setters to provide immutability
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	//private constructor to enforce object creation through builder
		private User(UserBuilder builder) {
			this.firstName=builder.firstName;
			this.lastName=builder.lastName;
			this.age=builder.age;
			this.phone=builder.phone;
			this.address=builder.address;
			
		}
	public static class UserBuilder{
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;
		
		public UserBuilder() {}
		
		 //builder methods for setting property
		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this; 
		}

		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		//return the finally object constructor user object
		public User build() {
			User user=new User(this);
			return user;
		}
		
	}
	@Override
	public String toString() {
		return "User: "+this.firstName+" "+this.lastName+" "+this.age+" "+
	" "+this.phone+" "+this.address;
	}
}
