package experts;


public class User extends GeneralExpert  {


	private int user_id;
	private String login;
	private String password;
	private boolean admin;
	private String name;
	private String surname;
	private int discount;

	
	
	public User() {
		//super();
	}

	public User(int user_id, String login, String password, boolean admin, String name, String surname, int discount) {
		this.user_id = user_id;
		this.login = login;
		this.password = password;
		this.admin = admin;
		this.name = name;
		this.surname = surname;
		this.discount = discount;
	}
	
	public User(int user_id, String name, String surname, int discount) {
		this.user_id = user_id;
		this.name = name;
		this.surname = surname;
		this.discount = discount;
	}
	

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "\n" + "User [user_id=" + user_id + ", login=" + login + ", password=" + password + ", admin=" + admin
				+ ", name=" + name + ", surname=" + surname + ", discount=" + discount + "]";
	}

}
