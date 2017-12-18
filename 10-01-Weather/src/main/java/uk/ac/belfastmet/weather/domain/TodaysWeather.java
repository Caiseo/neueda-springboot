package uk.ac.belfastmet.weather.domain;

public class TodaysWeather {
	private Location location;
	private Weather weather;

	public TodaysWeather() {
		super();
	}
	public TodaysWeather(Location location, Weather weather) {
		super();
		this.location = location;
		this.weather = weather;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}


}
