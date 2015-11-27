import java.util.ArrayList;

public class SuitCounter {

	private static final boolean COUNT_RANK = false;
	private Counter counter;
	public SuitCounter(ArrayList<Card> cards) {
		counter = new Counter(cards,COUNT_RANK);
	}
	
	public int max() {
		return counter.max();
	}

}
