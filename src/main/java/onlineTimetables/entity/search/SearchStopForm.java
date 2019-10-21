package onlineTimetables.entity.search;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SearchStopForm {
	@NotNull
	@NotEmpty
//	@Pattern(regexp = "a-zA-Z")
	private String textForSeatch;

	public String getTextForSeatch() {
		return textForSeatch;
	}

	public void setTextForSeatch(String textForSeatch) {
		this.textForSeatch = textForSeatch;
	}
}
