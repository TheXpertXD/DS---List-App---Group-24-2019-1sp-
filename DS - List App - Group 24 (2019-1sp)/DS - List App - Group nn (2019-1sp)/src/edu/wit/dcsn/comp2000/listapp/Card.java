/*
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: List application - card game
 * Spring, 2019
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 * 
 * Further, you may not post or otherwise share this code with anyone other than
 * current students in my sections of this course. Violation of these usage
 * restrictions will be considered a violation of the Wentworth Institute of
 * Technology Academic Honesty Policy.
 */

package edu.wit.dcsn.comp2000.listapp;


/**
 * @author Elijah Park
 * @version 1.1
 * Implemented equals()
 */
public class Card implements Comparable<Card>
	{


	public enum Suit{
        HEART,DIAMOND,SPADE,CLUB,NOTASUIT
}
	 public enum Rank{
	        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,
	        NOTAVALUE
	}
	 private int rank;
	 private int suit;
	 
	 
	public Card(int suit, int rank)
		{
		this.rank = rank;
		this.suit = suit;
		
		}	// end constructor
	public int getRank(){
        return this.rank;
    }

    public int getSuit(){
        return this.suit;
}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo( Card o )
		{
		// TODO Auto-generated method stub
		return 0 ;
		
		}	// end compareTo()



	/* (non-Javadoc)
	 * @see java.lang.Comparable#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object o )
		{
		
		return this.equals(o);
		
		}	// end equals()
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
		{
		 StringBuilder s = new StringBuilder("[");
	        s.append(this.rank);
	        s.append(this.suit);
	        s.append("]");
	return s.toString();
		
		}	// end toString()


	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Card
