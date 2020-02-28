package KladdeOppg2;

public class KjedetS<T>{

	public LinearNode<T> start;
	private int antall;
	
	public KjedetS() {
		start = null;
		setAntall(0);
	}
	
	public void push(T el) {
		LinearNode<T> nynode = new LinearNode<T>(el);
		nynode.setNeste(nynode);
		start = nynode;
		setAntall(getAntall() + 1);
	}
	
	public boolean erTom() {
		return (getAntall() == 0);
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}
}
