
public class Whale extends Animal {
	
	private String mainOcean;
	private Integer weight;
	private Integer maxSpeed;
	private Integer length;
	
	public Whale() {
		super();
	}

	public Whale(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Whale(String mainOcean, Integer weight, Integer maxSpeed, Integer length) {
		super();
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}

	public String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	@Override
	public String toString() {
		String result = 
		 "Whales Name =  " + getName ( )+ 
		 ", Main Ocean = " + getMainOcean ( ) + 
		 ", Weight = " + getWeight ( ) + 
		 ", Max Speed = " + getMaxSpeed ( )+ 
		 ", Length = " + getLength( );
		return result;
	}
	
	
}
