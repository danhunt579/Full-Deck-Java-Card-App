/*
	Filename: 	Card.java
	Developer: 	Dan Hunt
	Date:		01.25.19
	** Class that defines the attributes for a single playing card
*/

public class Card
{
	private String suit;
	private int value;
	private String rank;
	
	// Mutator Methods (setters)
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public void setValue(int num)
	{
		final int LOW = 1;
		final int HIGH = 13;
		if(num >= LOW && num <= HIGH)
		{
			value = num;
		}
		else
		{
			value = LOW; 
		}
		// Now that a value is set, let's determine rank
		switch(value)
		{
			case 1:
			{
				rank = "Ace";
				break;
			}
			case 11:
			{
				rank = "Jack";
				break;
			}
			case 12:
			{
				rank = "Queen";
				break;
			}			
			case 13:
			{
				rank = "King";
				break;
			}
			default:
			{
				rank = Integer.toString(value);
				break;
			}
		}
	}
			
	// Acessor Methods (getters)
	public String getSuit()
	{
		return suit;
	}
	public int getValue()
	{
		return value;
	}
	public String getRank()
	{
		return rank;
	}
}