package onlineTimetables.entity.stops.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class StopCreateForm {
	@NotEmpty
	private String name;
	@NotEmpty
	private String voivodeship;
	@NotEmpty
	private String city;
	@NotEmpty
	private String street;
	@NotEmpty
	private int number;
	@NotEmpty
	@Size(min = 2, max = 2)
	private int firstElement;
	@NotEmpty
	@Size(min = 3, max = 3)
	private int secondElement;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVoivodeship() {
		return voivodeship;
	}

	public void setVoivodeship(String voivodeship) {
		this.voivodeship = voivodeship;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFirstElement() {
		return firstElement;
	}

	public void setFirstElement(int firstElement) {
		this.firstElement = firstElement;
	}

	public int getSecondElement() {
		return secondElement;
	}

	public void setSecondElement(int secondElement) {
		this.secondElement = secondElement;
	}

}
