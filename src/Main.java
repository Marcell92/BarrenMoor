import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("You have just entered the Swamp!");
		System.out.println(
				"This grey swamp has few distinguishing characteristics, other than the fact that it is large and infinite and dreary!");
		System.out.println("However, you have a magic compass that leads you to a TREASURE!");
		System.out.println("Good luck!");

		Grid myGrid = new Grid();
		Player Tib = new Player(10, 13);
		Treasure gold = new Treasure(11, 14);
		myGrid.createGrid(Tib, gold);
		while (Tib.getPosPx() != gold.getPosTx() || Tib.getPosPy() != gold.getPosTy()) {

			myGrid.moveAround(reader.nextLine(), Tib);
			myGrid.print(Tib, gold);
		}

		System.out.print("You found the treasure!");

	}

}
