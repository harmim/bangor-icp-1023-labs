/**
 * PlayingCard Tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class PlayingCardTester
{
	public static void main (String[] args)
	{
		PlayingCard card1 = new PlayingCard(6, PlayingCard.SUIT_CLUBS);
		System.out.println("New PlayingCard 6 of Clubs");
		System.out.println("Test get methods");
		System.out.println("Rank: " + card1.getRank());
		System.out.println("Suit: " + card1.getSuit());

		System.out.println("\nTest create another cards and test toString and format methods");

		System.out.println("\nPlayingCard 6 of Clubs");
		System.out.println("toString: " + card1);
		System.out.println("format: " + card1.format());

		PlayingCard card2 = new PlayingCard(PlayingCard.RANK_JACK, PlayingCard.SUIT_CLUBS);
		System.out.println("\nNew PlayingCard Jack of Clubs");
		System.out.println("toString: " + card2);
		System.out.println("format: " + card2.format());

		PlayingCard card3 = new PlayingCard(PlayingCard.RANK_QUEEN, PlayingCard.SUIT_SPADES);
		System.out.println("\nNew PlayingCard Queen of Spades");
		System.out.println("toString: " + card3);
		System.out.println("format: " + card3.format());

		PlayingCard card4 = new PlayingCard(PlayingCard.RANK_KING, PlayingCard.SUIT_HEARTS);
		System.out.println("\nNew PlayingCard King of Hearts");
		System.out.println("toString: " + card4);
		System.out.println("format: " + card4.format());

		PlayingCard card5 = new PlayingCard(PlayingCard.RANK_ACE, PlayingCard.SUIT_DIAMONDS);
		System.out.println("\nNew PlayingCard Ace of Diamonds");
		System.out.println("toString: " + card5);
		System.out.println("format: " + card5.format());

		PlayingCard card6 = new PlayingCard(6, PlayingCard.SUIT_CLUBS);
		System.out.println("\nEquality test");
		System.out.println(card1.equals(null) + " (should by false)");
		System.out.println(card1.equals("Foo") + " (should by false)");
		System.out.println(card1.equals(card2) + " (should by false)");
		System.out.println(card1.equals(card1) + " (should by true)");
		System.out.println(card1.equals(card6) + " (should by true)");
	}
}
