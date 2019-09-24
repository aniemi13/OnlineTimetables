package onlineTimetables.entity.address;

public class Coordinates {
	private final String NORTH = "N";
	private final String SOUTH = "S";
	private final String WEST = "W";
	private final String EAST = "E";
	private final int LATITUDE_MIN = 0;
	private final int LATITUDE_MAX = 90;
	private final int LONGITUDE_MIN = 0;
	private final int LONGITUDE_MAX = 180;
	private final int TIME_MIN = 0;
	private final int TIME_MAX = 60;
	private final int ZERO_TO_SMALLER_THAN = 10;

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

	public Coordinates() {
	}

	public boolean addLatitude(String latitude) {
		if (latitudeDirectionIsNotGood(latitude))
			return false;
		this.latitude = latitude;
		return true;
	}

	private boolean latitudeDirectionIsNotGood(String latitude) {
		return !(latitude.equals(NORTH) || latitude.equals(SOUTH));
	}

	public boolean addLatitudeDegree(String latitudeDegree) {
		int latitude = Integer.parseInt(latitudeDegree);
		if (latitudeDataIsNotGood(latitude))
			return false;
		this.latitudeDegree = latitude;
		return true;
	}

	private boolean latitudeDataIsNotGood(int latitude) {
		return (latitude < LATITUDE_MIN || latitude > LATITUDE_MAX);
	}

	public boolean addLatitudeMinute(String latitudeMinute) {
		int minute = Integer.parseInt(latitudeMinute);
		if (minuteOrSecondDataIsNotGood(minute))
			return false;
		this.latitudeMinute = minute;
		return true;
	}

	private boolean minuteOrSecondDataIsNotGood(int time) {
		return (time < TIME_MIN || time > TIME_MAX);
	}

	private boolean minuteOrSecondDataIsNotGood(double time) {
		return (time < TIME_MIN || time > TIME_MAX);
	}
	
	public boolean addLatitudeSecond(String latitudeSecond) {
		double second = Double.parseDouble(latitudeSecond);
		if (minuteOrSecondDataIsNotGood(second))
			return false;
		this.latitudeSecond = second;
		return true;
	}

	public boolean addLongitude(String longitude) {
		if (longitudeDirectionIsNotGood(longitude))
			return false;
		this.longitude = longitude;
		return true;
	}

	private boolean longitudeDirectionIsNotGood(String longitude) {
		return !(longitude.equals(EAST) || longitude.equals(WEST));
	}

	public boolean addLongitudeDegree(String longitudeDegree) {
		int longitude = Integer.parseInt(longitudeDegree);
		if (longitudeDataIsNotGood(longitude))
			return false;
		this.longitudeDegree = longitude;
		return true;
	}

	private boolean longitudeDataIsNotGood(int longitude) {
		return (longitude < LONGITUDE_MIN || longitude > LONGITUDE_MAX);
	}

	public boolean addLongitudeMinute(String longitudeMinute) {
		int minute = Integer.parseInt(longitudeMinute);
		if (minuteOrSecondDataIsNotGood(minute))
			return false;
		this.longitudeMinute = minute;
		return true;
	}

	public boolean addLongitudeSecond(String longitudeSecond) {
		double second = Double.parseDouble(longitudeSecond);
		if (minuteOrSecondDataIsNotGood(second))
			return false;
		this.longitudeSecond = second;
		return true;
	}

	public String getCoordinates() {
		String latitudeD = createIntNumbers(latitudeDegree);
		String latitudeM = createIntNumbers(latitudeMinute);
		String latitudeS = createDoubleNumbers(latitudeSecond);
		
		String longitudeD = createIntNumbers(longitudeDegree);
		String longitudeM = createIntNumbers(longitudeMinute);
		String longitudeS = createDoubleNumbers(longitudeSecond);
		
		return (latitudeD + "\u00B0" + latitudeM + "'" + latitudeS + "\"" + latitude + " "
				+ longitudeD + "\u00B0" + longitudeM + "'" + longitudeS + "\"" + longitude);
	}

	private String createDoubleNumbers(double doubleNumber) {
		double second = roundNumber(doubleNumber, 10);
		if (second < ZERO_TO_SMALLER_THAN)
			return ("0" + second);
		return Double.toString(second);
	}

	private double roundNumber(double doubleNumber, int round) {
		double roundNumber = doubleNumber *= round;
		roundNumber = Math.round(roundNumber);
		roundNumber /= round;
		return roundNumber;
	}

	private String createIntNumbers(int intNumber) {
		if (intNumber < ZERO_TO_SMALLER_THAN) {
			return ("0" + intNumber);
		}
		return Integer.toString(intNumber);
	}
}