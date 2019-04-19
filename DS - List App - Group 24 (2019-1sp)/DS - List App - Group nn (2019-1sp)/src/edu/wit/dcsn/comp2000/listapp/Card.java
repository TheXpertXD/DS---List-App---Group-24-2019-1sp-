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

	private Rank rank;
	private Suit suit;
	 
	public Card(Rank newRank, Suit newSuit)
	{
		this.rank = newRank;
		this.suit = newSuit;
	}	// end constructor
	
	
	/**
	 * Retrieves the rank of the calling Card object
	 * @return returns rank object
	 */
	public Rank getRank(){
		
        return this.rank;
        
    } //end getRank

	
	/**
	 * Retrieves the suit of the calling card object
	 * @return returns suit object
	 */
    public Suit getSuit(){
    	
        return this.suit;
    }
   
    /**
     * Retrieves the graphic property of the calling card's rank object
     * @return string of the graphic property
     */
    public String getGraphic() {
    	
		return rank.getGraphic();
	}

    
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo( Card o )
	{
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
