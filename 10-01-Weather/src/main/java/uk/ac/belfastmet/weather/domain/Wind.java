package uk.ac.belfastmet.weather.domain;

public class Wind {

	private Float speed;
	private String direction;

	public Wind() {
		super();
	}

	public Wind(Float speed, String direction) {
		super();
		this.speed = speed;
		this.direction = direction;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}


}
