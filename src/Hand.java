import java.util.ArrayList;
import java.util.HashMap;

public class Hand {

	private ArrayList<Card> cards = new ArrayList<>();
	public Hand(String hand) {
		String[] cardStrings = hand.split(" ");
		for(String cardString : cardStrings) {
			cards.add(new Card(cardString));
		}

	}
	
	public String type() {
		HashMap<String, Integer> cardCounter = new HashMap<String, Integer>();
		for (Card card : cards) {
			String rank = card.rank();
			if (!cardCounter.containsKey(rank)) {
				cardCounter.put(rank, 1);
			} else {
				int counter = cardCounter.get(rank);
				counter++;
				cardCounter.put(rank, counter);
			}
		}
		
		if (hasAFour(cardCounter)) {
			return "Four Of A Kind";
		} 
		return "Three Of A Kind";
	}

	private boolean hasAFour(HashMap<String, Integer> cardCounter) {
		for (String rank : cardCounter.keySet()) {
			int counter = cardCounter.get(rank);
			if (counter == 4) return true;
		}
		return false;
	}

}
