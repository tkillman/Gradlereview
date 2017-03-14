package spring.chap15;

public class Dto {

	private String memberId;
	private String password;
	private String name;
	private String email;
	
	public Dto(){}
	
	public Dto(String memberId, String password, String name, String email) {
		
		this.memberId = memberId;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Dto [memberId=" + memberId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
