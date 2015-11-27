import java.util.ArrayList;

public class ComboCounter {

	private static final boolean COUNT_RANK = true;	
	private Counter counter;
	
	public ComboCounter(ArrayList<Card> cards) {
		counter = new Counter(cards,COUNT_RANK);
	}
	
	public int max() {
		return counter.max();
	}

}
