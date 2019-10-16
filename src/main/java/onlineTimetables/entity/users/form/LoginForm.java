package onlineTimetables.entity.users.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
	@NotNull
	@NotEmpty
	@Size(min = 3)
	private String email;
	@NotNull
	@NotEmpty
	@Size(min = 8)
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
