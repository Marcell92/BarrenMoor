
public class Treasure {

	private int posTx;
	private int posTy;

	public Treasure(int posTx, int posTy) {

		this.setPosTx(posTx);
		this.setPosTy(posTy);

	}

	public int getPosTy() {
		return posTy;
	}

	public void setPosTy(int posTy) {
		this.posTy = posTy;
	}

	public int getPosTx() {
		return posTx;
	}

	public void setPosTx(int posTx) {
		this.posTx = posTx;
	}
}
