package onlineTimetables.entity.address.form;

public class CoordinatesForm {
	// równoleżnik 90
		private String latitude;
		private int latitudeDegree;
		private int latitudeMinute;
		private double latitudeSecond;
		// południk 180
		private String longitude;
		private int longitudeDegree;
		private int longitudeMinute;
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
