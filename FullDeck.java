/*
	Filename: FullDeck.java
	Author: Dan Hunt
	Date: 02.11.19
	- Using the card.java, this program will create an Array of 52 card objects
*/

public class FullDeck
{
	public static void main(String[] args)
	{
		// Variables and constants
		final int CARDS_IN_DECK = 52;
		Card[] cardArray = new Card[CARDS_IN_DECK];
		int value = 1;
		int suit = 1;
		
		// This for loop will generate all 52 cards in order
		for(int x = 0; x < cardArray.length; ++x)
		{
			cardArray[x] = new Card();
			
			// Start the suit variable at 0 and assign different suit for each
			switch(suit)
			{
				case 1:
				{
					cardArray[x].setSuit("Spades");
					break;
				}
				case 2:
				{
					cardArray[x].setSuit("Hearts");
					break;
				}
				case 3:
				{
					cardArray[x].setSuit("Diamonds");
					break;
				}
				case 4:
				{
					cardArray[x].setSuit("Clubs");					
					break;
				}
			}
			cardArray[x].setValue(value);
			System.out.println(cardArray[x].getRank() + "of" + cardArray[x].getSuit());
			value++;  //Changes this variable before we loop again
			
			// decide if we are done with a suit or not
			if(value > 13)
			{
				suit++;
				value = 1;
			}
			
		} // end of for loop
		
		System.out.println("\n\nCard Deck Complete......");		
	}
}