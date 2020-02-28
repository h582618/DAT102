package KladdeOppg2;

public class LinearNode<T> {

	private LinearNode<T> neste;
	private T element;
	
//	Oppretter en tom node

	public LinearNode() {
		neste = null;
		element = null;
		
	}
	 public LinearNode (T elem) {
		    neste   = null;
		    element = elem;
		  }

	public LinearNode<T> getNeste() {
		return neste;
	}

	public void setNeste(LinearNode<T> start) {
		this.neste = start;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;

}
}