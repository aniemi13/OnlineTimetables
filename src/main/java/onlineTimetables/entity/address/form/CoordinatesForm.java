package onlineTimetables.entity.address.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import onlineTimetables.entity.address.Coordinates;

public class CoordinatesForm {
	// równoleżnik 90
	@Size(min=1, max=1)
	@Pattern(regexp = "[" + Coordinates.NORTH + Coordinates.SOUTH + "]")
	@NotEmpty
	private String latitude;
	@Size(min=1, max=2)
	@Min(value = Coordinates.LATITUDE_MIN)
	@Max(value = Coordinates.LATITUDE_MAX)
	@NotEmpty
	private int latitudeDegree;
	@Size(min=1, max=2)
	@Min(value = Coordinates.TIME_MIN)
	@Max(value = Coordinates.TIME_MAX)
	@NotEmpty
	private int latitudeMinute;
	@Size(min=1, max=2)
	@Min(value = Coordinates.TIME_MIN)
	@Max(value = Coordinates.TIME_MAX)
	@NotEmpty
	private double latitudeSecond;
	
	// południk 180
	@Size(min=1, max=1)
	@Pattern(regexp = "[" + Coordinates.WEST + Coordinates.EAST + "]")
	@NotEmpty
	private String longitude;
	@Size(min=1, max=2)
	@Min(value = Coordinates.LONGITUDE_MIN)
	@Max(value = Coordinates.LONGITUDE_MAX)
	@NotEmpty
	private int longitudeDegree;
	@Size(min=1, max=2)
	@Min(value = Coordinates.TIME_MIN)
	@Max(value = Coordinates.TIME_MAX)
	@NotEmpty
	private int longitudeMinute;
	@Size(min=1, max=2)
	@Min(value = Coordinates.TIME_MIN)
	@Max(value = Coordinates.TIME_MAX)
	@NotEmpty
	private double longitudeSecond;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public int getLatitudeDegree() {
		return latitudeDegree;
	}

	public void setLatitudeDegree(int latitudeDegree) {
		this.latitudeDegree = latitudeDegree;
	}

	public int getLatitudeMinute() {
		return latitudeMinute;
	}

	public void setLatitudeMinute(int latitudeMinute) {
		this.latitudeMinute = latitudeMinute;
	}

	public double getLatitudeSecond() {
		return latitudeSecond;
	}

	public void setLatitudeSecond(double latitudeSecond) {
		this.latitudeSecond = latitudeSecond;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getLongitudeDegree() {
		return longitudeDegree;
	}

	public void setLongitudeDegree(int longitudeDegree) {
		this.longitudeDegree = longitudeDegree;
	}

	public int getLongitudeMinute() {
		return longitudeMinute;
	}

	public void setLongitudeMinute(int longitudeMinute) {
		this.longitudeMinute = longitudeMinute;
	}

	public double getLongitudeSecond() {
		return longitudeSecond;
	}

	public void setLongitudeSecond(double longitudeSecond) {
		this.longitudeSecond = longitudeSecond;
	}

}
