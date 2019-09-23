package onlineTimetables.entity.address;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddressForm {
	@NotNull(message = "Pole nie może być puste")
	private String voivodeship;
	@NotNull(message = "Pole nie może być puste")
	private String city;
	@NotNull(message = "Pole nie może być puste")
	private String street;
	@NotNull(message = "Pole nie może być puste")
	private double number;
	@NotNull(message = "Pole nie może być puste")
	@Size(min = 2, max = 2)
	private int firstElement;
	@NotNull(message = "Pole nie może być puste")
	@Size(min = 3, max = 3)
	private int secondElement;

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

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
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
