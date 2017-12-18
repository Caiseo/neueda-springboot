
public class GameParents {
	
	private Integer xPosition;
	private Integer yPosition;
	private String direction;
	private double speed;
	
	public GameParents() {
		super();
	}

	public GameParents(Integer xPosition, Integer yPosition, String direction, double speed) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.direction = direction;
		this.speed = speed;
	}

	public Integer getxPosition() {
		return xPosition;
	}

	public void setxPosition(Integer xPosition) {
		this.xPosition = xPosition;
	}

	public Integer getyPosition() {
		return yPosition;
	}

	public void setyPosition(Integer yPosition) {
		this.yPosition = yPosition;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String toString() {
		return "Parent [xPosition=" + xPosition + ", yPosition=" + yPosition + ", direction=" + direction + ", speed="
				+ speed + "]";
	}
	
	
}
