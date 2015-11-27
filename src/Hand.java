import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> cards = new ArrayList<>();
	public Hand(String hand) {
		String[] cardStrings = hand.split(" ");
		for(String cardString : cardStrings) {
			cards.add(new Card(cardString));
		}

	}
	
	public String type() {
		
		SuitCounter suitCounter = new SuitCounter(cards);
		int maxSuits = suitCounter.max();
		if (maxSuits==5) {
			return "Flush";
		}
		ComboCounter comboCounter = new ComboCounter(cards);
		int maxCombo = comboCounter.max();
		switch(maxCombo) {
		case 4:
			return "Four Of A Kind";
		case 3:
			return "Three Of A Kind";
		}
		return "One Pair";

	}
}
