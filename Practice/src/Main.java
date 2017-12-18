import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList spaceships = new ArrayList<Spaceship>();
		
		Spaceship a = new Spaceship ();
		a.setxPosition(1);
		a.setyPosition(2);
		a.setDirection("north");
		a.setSpeed(5);
		a.setAmmo(20);
		a.setLives(3);
		
		spaceships.add(a);
		
		ArrayList asteroids = new ArrayList<Asteroid>();
		
		Asteroid b = new Asteroid ();
		b.setxPosition(3);
		b.setyPosition(4);
		b.setDirection("south");
		b.setSpeed(2);
		
		asteroids.add(b);
		
		Asteroid c = new Asteroid ();
		c.setxPosition(3);
		c.setyPosition(4);
		c.setDirection("south");
		c.setSpeed(2);
		
		asteroids.add(c);
		
		Asteroid d = new Asteroid ();
		d.setxPosition(3);
		d.setyPosition(4);
		d.setDirection("south");
		d.setSpeed(2);
		
		asteroids.add(d);
		
		System.out.println(a);
		
		System.out.println("---Shoot 30 times ---");
		for (int i = 0; i <30; i++);
		{
			a.shoot();
		}
		}
	}
