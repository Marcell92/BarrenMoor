import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Player {

	static Scanner move = new Scanner(System.in);

	private int posPx;
	private int posPy;

	public Player(int posPx, int posPy) {

		this.setPosPx(posPx);
		this.setPosPy(posPy);

	}

	public int getPosPx() {
		return posPx;
	}

	public void setPosPx(int posPx) {
		this.posPx = posPx;
	}

	public int getPosPy() {
		return posPy;
	}

	public void setPosPy(int posPy) {
		this.posPy = posPy;
	}

}
