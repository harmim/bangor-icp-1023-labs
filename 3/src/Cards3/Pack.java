package Cards3;


import java.util.ArrayList;
import java.util.Collections;


/**
 * Pack of PlayingCards.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class Pack
{
	/**
	 * Pack of PlayingCards.
	 */
	private ArrayList<PlayingCard> cards;


	/**
	 * Constructs a pack of 52 cards.
	 * Sorted by suit Clubs, Diamonds, Hearts, Spades.
	 * Sorted ascending.
	 */
	public Pack()
	{
		cards = new ArrayList<>();

		for (int rank = 2; rank <= PlayingCard.RANK_ACE; rank++) {
			for (int suit = PlayingCard.SUIT_CLUBS; suit <= PlayingCard.SUIT_SPADES; suit++) {
				cards.add(new PlayingCard(rank, suit));
			}
		}
	}


	/**
	 * Shuffles cards in pack.
	 */
	public void shuffle()
	{
		Collections.shuffle(cards);
	}


	/**
	 * Returns string representation of 52 card pack.
	 *
	 * @return string representation of 52 card pack
	 */
	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder("Pack{");
		for (int i = 0; i < cards.size(); i++) {
			s.append(cards.get(i));
			if (i + 1 != cards.size()) {
				s.append(", ");
			}
		}
		s.append("}");

		return s.toString();
	}
}
