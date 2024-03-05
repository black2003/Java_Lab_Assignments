package assignment4;

public class Card implements Comparable<Card> {
    public static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    public static final String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King" };

    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return ranks[rank - 1] + " of " + suit;
    }

	@Override
	public int compareTo(Card otherCard) {
        // First, compare ranks
		if (this.rank != otherCard.rank) {
	        return Integer.compare(this.rank, otherCard.rank);
	    }
	    // If ranks are equal, compare suits
	    return this.suit.compareTo(otherCard.suit);
    }
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof Card)) {
	        return false;
	    }
	    Card otherCard = (Card) obj;
	    return this.rank == otherCard.rank && this.suit.equals(otherCard.suit);
	}
}