package belajar.spring.ioc;

public class KoneksiDatabase {
	private String url;
	private String username;
	private String password;
	
	public void connect() {
		System.out.println("Connect ke database");
	}
	
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
