package onlineTimetables.entity.users.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationForm {
	@NotNull
	@NotEmpty
	@Size(min = 3)
	@Email
	private String email;
	@NotNull
	@NotEmpty
	@Size(min = 8)
	private String password;
	@NotNull
	@NotEmpty
	@Size(min = 8)
	private String confirmPassword;

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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
