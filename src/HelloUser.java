
public class HelloUser {
	public String userName;
	
	public void greetUser() {
		System.out.println("Hello " + userName + "!");
		
	}

	public HelloUser(String userName) {
		super();
		this.userName = userName;
	}
	
}
