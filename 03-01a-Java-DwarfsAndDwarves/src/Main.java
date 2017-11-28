import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Dwarfs = new ArrayList<String>();
		ArrayList<String> Dwarves = new ArrayList<String>();
		
		Dwarfs.add("Happy");
		Dwarfs.add("Sleepy");
		Dwarfs.add("Dopey");
		Dwarfs.add("Bashful");
		Dwarfs.add("Sneezy");
		Dwarfs.add("Doc");
		Dwarfs.add("Grumpy");
		
		Dwarves.add("Thorin");
		Dwarves.add("Balin");
		Dwarves.add("Dwalin");
		Dwarves.add("Fíli");
		Dwarves.add("Kíli");
		Dwarves.add("Dori");
		Dwarves.add("Nori");
		Dwarves.add("Ori");
		Dwarves.add("Óin");
		Dwarves.add("Glóin");
		Dwarves.add("Bifur");
		Dwarves.add("Bofur");
		Dwarves.add("Bombur");
		
		System.out.println("The Disney Dwarfs are:");		
				
		for(int i = 0; i < Dwarfs.size(); i++) {
		System.out.println(Dwarfs.get(i));
		}
		
		System.out.println("The Lord of the Rings Dwarves are:");
		for(int i = 0; i < Dwarves.size(); i++) {
		System.out.println(Dwarves.get(i));
		}
	}

}
