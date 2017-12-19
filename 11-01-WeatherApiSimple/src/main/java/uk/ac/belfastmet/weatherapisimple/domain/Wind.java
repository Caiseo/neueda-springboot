package uk.ac.belfastmet.weatherapisimple.domain;

public class Wind {

	private Integer speed;
	private String direction;

	public Wind() {
		super();
	}

	public Wind(Integer speed, String direction) {
		super();
		this.speed = speed;
		this.direction = direction;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", direction=" + direction + "]";
	}


}
