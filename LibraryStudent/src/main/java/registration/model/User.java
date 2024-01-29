package registration.model;

public class User {
	private int id;
	private String userName;
	private String password;
	private String address;
	private String phoneNum;
	private int status;
	private boolean isLoaned;
	
	public User(int id, String userName, String address, String phoneNum,
			boolean isLoaned) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
		this.phoneNum = phoneNum;
		this.isLoaned = isLoaned;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	 public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public boolean isLoaned() {
		return isLoaned;
	}
	public void setLoaned(boolean isLoaned) {
		this.isLoaned = isLoaned;
	}

}

