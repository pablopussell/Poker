import java.util.ArrayList;
import java.util.HashMap;

public class Counter {
	
	private HashMap<String, Integer> cardCounter = new HashMap<String, Integer>();
	
	public Counter(ArrayList<Card> cards, boolean isItACombo) {
		
		for (Card card : cards) {
			String attribute = "";
			if (isItACombo==true) {
				attribute = card.rank();
			} else attribute = card.suit();
			if (!cardCounter.containsKey(attribute)) {
				cardCounter.put(attribute, 1);
			} else {
				int counter = cardCounter.get(attribute);
				counter++;
				cardCounter.put(attribute, counter);
			}
		}
	}

	public int max() {
		int maxCombo = 1;
		for (String rank : cardCounter.keySet()) {
				int counter = cardCounter.get(rank);
				if (counter > maxCombo) {
					maxCombo = counter;
				}
			}
		return maxCombo;
	}
}


