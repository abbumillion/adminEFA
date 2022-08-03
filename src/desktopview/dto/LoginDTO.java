package desktopview.dto;



public class LoginDTO {
	/**
	 * this a login data transfer object
	 * transfer data from the view to spring security
	 * used for authentication
	 */
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
