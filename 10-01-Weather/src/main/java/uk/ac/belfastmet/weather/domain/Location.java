package uk.ac.belfastmet.weather.domain;

public class Location {
	private String name;
	private Float latitude;
	private Float longitude;

	public Location() {
		super();
	}
	public Location(String name, Float latitude, Float longitude) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}


}
