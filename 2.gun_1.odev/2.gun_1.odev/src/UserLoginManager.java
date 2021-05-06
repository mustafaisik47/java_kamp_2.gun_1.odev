
public class UserLoginManager {
	void add(UserLogin userLogin) {
		System.out.println("Kullanýcý Eklendi : " + userLogin.getLastName());		
	}
	
	void delete(UserLogin userLoginDelete) {
		System.out.println("Kullanýc silindi : " + userLoginDelete.getLastName());
	}
}
