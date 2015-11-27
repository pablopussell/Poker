
public class Card {
	
	private String cardValue;

	public Card(String cardValue) {
		this.cardValue = cardValue;
	}
	
	public String rank() {
		return cardValue.substring(0,cardValue.length()-1);
	}
	
	public String suit() {
		return cardValue.substring(cardValue.length()-1,cardValue.length());
	}

}


