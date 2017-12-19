package uk.ac.belfastmet.weatherapisimple.domain;

public class Weather {

	private String description;
	private String precipitation;
	private Float temperature;
	private String humidity;
	private Integer pressure;
	private Integer cloudcover;
	private Wind wind;
	private String image;

	public Weather() {
		super();
	}

	public Weather(String description, String precipitation, Float temperature, String humidity, Integer pressure,
			Integer cloudcover, Wind wind, String image) {
		super();
		this.description = description;
		this.precipitation = precipitation;
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.cloudcover = cloudcover;
		this.wind = wind;
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public Integer getPressure() {
		return pressure;
	}

	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getCloudcover() {
		return cloudcover;
	}

	public void setCloudcover(Integer cloudcover) {
		this.cloudcover = cloudcover;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Weather [description=" + description + ", precipitation=" + precipitation + ", temperature="
				+ temperature + ", humidity=" + humidity + ", pressure=" + pressure + ", cloudcover=" + cloudcover
				+ ", wind=" + wind + ", image=" + image + "]";
	}


}
