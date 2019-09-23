package onlineTimetables.entity.address;

public class Address {
	private String voivodeship;
	private String city;
	private String street;
	private double number;
	private ZipCode zipcode;
	
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
	public ZipCode getZipcode() {
		return zipcode;
	}
	public void setZipcode(ZipCode zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
