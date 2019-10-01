package onlineTimetables.entity.stops.form;

import onlineTimetables.entity.address.Address;
import onlineTimetables.entity.address.Coordinates;

public class StopCreateForm {
	private String name;
	private Address address;
	private Coordinates coordinates;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	
}
