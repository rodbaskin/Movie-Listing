import java.util.*;

public class Movies {
	private String category;
	private String title;

	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Rod's Movie Listing Application");
		System.out.println();
		System.out.println("There are 100 movies in this selection");
		System.out.println("Choose a category or by title!");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		ArrayList<String> animated = new ArrayList<String>();
		animated.add("Dispicable Me");
		animated.add("Dispicable Me 2");
		animated.add("Finding Nemo");
		animated.add("Finding Dory");
		animated.add("Frozen");
		animated.add("Ice Age");
		animated.add("Ice Age 2");
		animated.add("Ice Age 3");
		animated.add("Justice League Gods Among Us");
		animated.add("Justice League Gods and Monsters");
		animated.add("Justice League vs. Teen Titans");
		animated.add("Justice League Throne of Atlantis");
		animated.add("Justce League War");
		animated.add("Kung Fu Panda");
		animated.add("Kung Fu Panda 2");
		animated.add("Kung Fu Panda 3");
		animated.add("The Lion King");
		animated.add("The Lion King 1 1/2");
		animated.add("Madagascar");
		animated.add("Madagascar 2");
		animated.add("Madagascar 3");
		animated.add("Penguins of Madagascar");
		animated.add("Penguins of Madagascar 2");
		animated.add("Toy Story");
		animated.add("Toy Story 2");
		animated.add("Toy Story 3");

		ArrayList<String> drama = new ArrayList<String>();
		drama.add("12 Years A Slave");
		drama.add("Armeggdon");
		drama.add("American Sniper");
		drama.add("Babel");
		drama.add("Bridge of Spies");
		drama.add("Dark Honeymoon");
		drama.add("Gran Torino");
		drama.add("Gravity");
		drama.add("Inside Man");
		drama.add("Life of PI");
		drama.add("Ministers");
		drama.add("Motives");
		drama.add("Motives 2");
		drama.add("Pride & Prejudice");
		drama.add("Pursuit of Happyness");
		drama.add("Risen");
		drama.add("She Hates Me");
		drama.add("Spotlight");
		drama.add("Straight Outta Compton");
		drama.add("The Kings Speech");
		drama.add("The Perfect Guy");
		drama.add("The Perfect Match");
		drama.add("Unknown");
		drama.add("Unstoppable");
		drama.add("Unthinkable");

		ArrayList<String> horror = new ArrayList<String>();
		horror.add("Antichrist");
		horror.add("The Babbadook");
		horror.add("Creep");
		horror.add("The Conjuring");
		horror.add("The Conjuring 2");
		horror.add("Detention");
		horror.add("Devil");
		horror.add("Event Horizon");
		horror.add("The Excorcist");
		horror.add("Fears of the Dark");
		horror.add("Hush");
		horror.add("It Follows");
		horror.add("Insidious");
		horror.add("Insidious 2");
		horror.add("Insidious 3");
		horror.add("Poltergeist");
		horror.add("The Purge");
		horror.add("The Purge 2");
		horror.add("The Purge 3");
		horror.add("Saw");
		horror.add("The Shining");
		horror.add("Sinister");
		horror.add("The Vatican Tapes");
		horror.add("The Woman");
		horror.add("The Witch");

		ArrayList<String> scifi = new ArrayList<String>();
		scifi.add("Avengers");
		scifi.add("Avengers: Age of Ultron");
		scifi.add("Batman v. Superman");
		scifi.add("Divergent Series");
		scifi.add("ExMachina");
		scifi.add("Gravity");
		scifi.add("Ghost Busters");
		scifi.add("Hot Tub Time Machine");
		scifi.add("Hot Tub Time Mchine 2");
		scifi.add("Inception");
		scifi.add("Independence Day");
		scifi.add("Jupiter Ascending");
		scifi.add("Jurassic World");
		scifi.add("Loopers");
		scifi.add("Limitless");
		scifi.add("Maze Runner");
		scifi.add("Maze Runner 2: The Scorch Trials");
		scifi.add("Now You See Me");
		scifi.add("Now You See Me 2");
		scifi.add("Parallels");
		scifi.add("Sherlock Holmes");
		scifi.add("Sherlock Holmes: Game of Shadows");
		scifi.add("Star Wars: The Force Awakens");
		scifi.add("Terminator Genisys");
		scifi.add("TomorrowLand");

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("What category are you interested in?");

			String movielist = sc.nextLine();
			switch (movielist) {
			case "animated":
				System.out.println(animated);
				break;
			case "drama":
				System.out.println(drama);
				break;
			case "horror":
				System.out.println(horror);
				break;
			case "scifi":
				System.out.println(scifi);
				break;
			}

			System.out.print("Continue? y/n): ");
			choice = sc.nextLine();

		}
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}