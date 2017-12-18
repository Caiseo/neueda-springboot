
public class Spaceship extends GameParents {

		private Integer ammo;
		private Integer lives;
		
		public Spaceship() {
			super();
		}

		public Spaceship(Integer ammo, Integer lives) {
			super();
			this.ammo = ammo;
			this.lives = lives;
		}

		public Integer getAmmo() {
			return ammo;
		}

		public void setAmmo(Integer ammo) {
			this.ammo = ammo;
		}

		public Integer getLives() {
			return lives;
		}

		public void setLives(Integer lives) {
			this.lives = lives;
		}

		@Override
		public String toString() {
			String result =
					"[xPosition=" + getxPosition() +  ", yPosition=" + getyPosition()+ ", direction=" + getDirection() + ", speed="
					+ getSpeed()+  "Spaceship ammo=" + getAmmo() + ", lives=" + getLives()+ "]";
			return result;
		}
		
		public void shoot() {
		if (ammo > 0)
		{
			System.out.println("Shots fired");
			ammo -=4;
		}
		else
		{
			System.out.println("out of ammo");
		}
		}
}
