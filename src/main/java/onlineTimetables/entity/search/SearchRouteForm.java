package onlineTimetables.entity.search;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SearchRouteForm {
	@NotEmpty
	@NotNull
	private String firstSearchText;
	@NotEmpty
	@NotNull
	private String secondSearchText;

	public String getFirstSearchText() {
		return firstSearchText;
	}

	public void setFirstSearchText(String firstSearchText) {
		this.firstSearchText = firstSearchText;
	}

	public String getSecondSearchText() {
		return secondSearchText;
	}

	public void setSecondSearchText(String secondSearchText) {
		this.secondSearchText = secondSearchText;
	}
}
