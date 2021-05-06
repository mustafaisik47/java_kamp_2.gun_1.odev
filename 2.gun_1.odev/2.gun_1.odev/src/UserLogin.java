
public class UserLogin {
	int id;
	String name;
	String lastName;
	String userName;
	
	public UserLogin() {
		
	}
	
	public UserLogin(int id, String name, String lastName, String userName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		
		
	}

}
