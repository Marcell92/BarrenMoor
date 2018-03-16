
public class Grid {

	private static int Grid[][] = new int[15][15];
	{

	}

	public Grid() {

	}

	public void createGrid(Player Tib, Treasure gold) {

		for (int a = 0; a < 15; a++) {
			for (int b = 0; b < 15; b++) {
				Grid[a][b] = 0;
				Grid[Tib.getPosPx()][Tib.getPosPy()] = 1;
				Grid[gold.getPosTx()][gold.getPosTy()] = 100;
				System.out.print(" " + Grid[a][b] + " ");
			}
			System.out.println();
		}

	}

	public int[][] getGrid() {

		return Grid;

	}

	public static void moveAround(String direction, Player Tib) {

		switch (direction) {

		case "right":
			Tib.setPosPy(Tib.getPosPy() + 1);
			break;

		case "left":
			Tib.setPosPy(Tib.getPosPy() - 1);
			break;

		case "up":
			Tib.setPosPx(Tib.getPosPx() - 1);
			break;

		case "down":
			Tib.setPosPx(Tib.getPosPx() + 1);

		}

	}

	public static void print(Player Tib, Treasure gold) {
		System.out.println(Math.hypot(gold.getPosTx() - Tib.getPosPx(), gold.getPosTy() - Tib.getPosPy())); // only
																											// useful if
																											// the
																											// treasure
																											// is hidden Grid[gold.getPosTx()][gold.getPosTy()] = 0;

		for (int a = 0; a < 15; a++) {
			for (int b = 0; b < 15; b++) {
				Grid[a][b] = 0;
				Grid[Tib.getPosPx()][Tib.getPosPy()] = 1;
				Grid[gold.getPosTx()][gold.getPosTy()] = 100;
				System.out.print(" " + Grid[a][b] + " ");
			}
			System.out.println();
		}

	}
}