import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

Dwarf sleepy = new Dwarf();
sleepy.setName("Sleepy");
sleepy.setAuthor("Disney");
sleepy.setImage("Sleepy.png");

Dwarf happy = new Dwarf();
happy.setName("Happy");
happy.setAuthor("Disney");
happy.setImage("Happy.png");

Dwarf dopey = new Dwarf();
dopey.setName("Dopey");
dopey.setAuthor("Disney");
dopey.setImage("Dopey.png");

dwarfs.add(sleepy);
dwarfs.add(happy);
dwarfs.add(dopey);
	}

}
