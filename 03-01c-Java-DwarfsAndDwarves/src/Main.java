import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		ArrayList<Dwarf> dwarves = new ArrayList<Dwarf>();

		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfs.add(happy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(happy);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(bashful);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(grumpy);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(doc);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		dwarfs.add(sneezy);

		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
		dwarves.add(thorin);
		Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
		dwarves.add(balin);
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
		dwarves.add(dwalin);
		Dwarf fili = new Dwarf("Fíli", "Tolkien", "Fíli.png");
		dwarves.add(fili);
		Dwarf kili = new Dwarf("Kíli", "Tolkien", "Kíli.png");
		dwarves.add(kili);
		Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
		dwarves.add(dori);
		Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
		dwarves.add(nori);
		Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
		dwarves.add(ori);
		Dwarf oin = new Dwarf("Óin", "Tolkien", "Óin.png");
		dwarves.add(oin);
		Dwarf gloin = new Dwarf("Glóin", "Tolkien", "Glóin.png");
		dwarves.add(gloin);
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
		dwarves.add(bifur);
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
		dwarves.add(bofur);
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
		dwarves.add(bombur);

		System.out.println("Snow White's Dwarfs are:");
		for (Dwarf dwarf : dwarfs) {
			System.out.println(dwarf.getName() + " : " + dwarf.getAuthor() + " : " + dwarf.getImage());
		}

		System.out.println();
		System.out.println("The Company of Tolkien Dwarves are:");
		for (Dwarf dwarf : dwarves) {
			System.out.println(dwarf.getName() + " : " + dwarf.getAuthor() + " : " + dwarf.getImage());
		}
	}

}
