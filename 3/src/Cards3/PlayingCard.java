package Cards3;


/**
 * Representation of standard playing card.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class PlayingCard
{
	/**
	 * Rank special values.
	 */
	public static final int
		RANK_JACK = 11,
		RANK_QUEEN = 12,
		RANK_KING = 13,
		RANK_ACE = 14;

	/**
	 * Suit values.
	 */
	public static final int
		SUIT_CLUBS = 0,
		SUIT_DIAMONDS = 1,
		SUIT_HEARTS = 2,
		SUIT_SPADES = 3;


	/**
	 * Rank of the PlayingCard, values 2-10 or one of the RANK_... constant so values 2-14.
	 */
	private int rank;

	/**
	 * Suit of the PlayingCard, one of the SUIT_... constant, values 0-3.
	 */
	private int suit;


	/**
	 * Constructs a card with specified initial rank and suit.
	 *
	 * @param rank initial rank
	 * @param suit initial suit
	 */
	public PlayingCard(int rank, int suit)
	{
		this.rank = rank;
		this.suit = suit;
	}


	/**
	 * Returns rank of PlayingCard.
	 *
	 * @return value of rank of PlayingCard
	 */
	public int getRank()
	{
		return rank;
	}


	/**
	 * Returns suit of PlayingCard.
	 *
	 * @return value of suit of PlayingCard
	 */
	public int getSuit()
	{
		return suit;
	}


	/**
	 * Tests whether this card is equal to some other object.
	 *
	 * @param object the object to be tested
	 * @return true if it is the same object or if object is instance of PlayingCard and has the same rank and suit,
	 *         false otherwise
	 */
	@Override
	public boolean equals(Object object)
	{
		if (this == object) {
			return true;
		}

		if (object == null || getClass() != object.getClass()) {
			return false;
		}

		PlayingCard playingCard = (PlayingCard) object;

		return playingCard.rank == rank && playingCard.suit == suit;
	}


	/**
	 * Returns formatted string representation of PlayingCard instance.
	 *
	 * @return formatted string representation of PlayingCard instance
	 */
	public String format()
	{
		return rankToString(true) + " " + suitToString(true);
	}


	/**
	 * Returns string representation of PlayingCard instance.
	 *
	 * @return string representation of PlayingCard instance
	 */
	@Override
	public String toString()
	{
		return "PlayingCard[" +
			"rank=" + rankToString(false) +
			", suit=" + suitToString(false) +
			"]";
	}


	/**
	 * Converts rank value to string representation.
	 *
	 * @param symbol return symbol of rank
	 * @return string representation of rank
	 */
	private String rankToString(boolean symbol)
	{
		switch (rank) {
			case RANK_JACK:
				return symbol ? "J" : "Jack";

			case RANK_QUEEN:
				return symbol ? "Q" : "Queen";

			case RANK_KING:
				return symbol ? "K" : "King";

			case RANK_ACE:
				return symbol ? "A" : "Ace";

			default:
				return Integer.toString(rank);
		}
	}


	/**
	 * Converts suit value to string representation.
	 *
	 * @param symbol return symbol of suit
	 * @return string representation of suit
	 */
	private String suitToString(boolean symbol)
	{
		switch (suit) {
			case SUIT_CLUBS:
				return symbol ? "♣" : "Clubs";

			case SUIT_DIAMONDS:
				return symbol ? "♦" : "Diamonds";

			case SUIT_HEARTS:
				return symbol ? "♥" : "Hearts";

			case SUIT_SPADES:
				return symbol ? "♠" : "Spades";

			default:
				return Integer.toString(suit);
		}
	}
}
