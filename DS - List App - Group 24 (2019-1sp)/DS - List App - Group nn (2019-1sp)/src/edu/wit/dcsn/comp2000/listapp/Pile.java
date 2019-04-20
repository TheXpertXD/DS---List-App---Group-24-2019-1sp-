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

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Andrew Zemko
 * @version 1.3
 * Implemented most methods including getter & toString
 *
 */
public class Pile implements Iterable<Card>
	{
	
	private LinkedList<Card> cards = new LinkedList<Card>();		//Collection of card objects
	


	public Pile() {

		
	}	// end constructor
	
	/**
	 * Retrieves the card pile
	 * @return LinkedList of cards
	 */
	public LinkedList<Card> getPile(){
		
		return cards;
	} //end getPile
	
	
	/**
	 * Retrieves the top card
	 * @return card on top of pile
	 */
	public Card getTop() {
		return cards.remove();
	}
	
	/**
	 * Shuffles/Rearranges the list of card objects
	 * @param pile
	 */
	public void shuffle(LinkedList<Card> pile) {
		
		Collections.shuffle(pile);
	} // end shuffle
	
	
	/**
	 * Adds a card object to the pile
	 * @param card
	 */
	public void add(Card card) {
		
		cards.add(card);
	} // end add
	
	/**
	 * Retrieves the card at the specified index
	 * @param index
	 * @return card
	 */
	public Card get(int index) {
		return cards.get(index);
	} //end 
	
	
	/**
	 * Locates a desired card within the pile ***Testing only***
	 * @param card
	 * @return card
	 */
	public Card findCard(Card card) {
		
		return null;
	} // end findCard
	
	/**
	 * Sorts list into fourteen groups: ranks Ace-Joker in ascending order ***Testing only***
	 * @param rank
	 * @return null
	 */
	public Pile groupBy(Rank rank) {
		
		return null;
	} // end groupBy ranks
	
	
	/**
	 * Sorts list into four groups: Spades, Clubs, Diamonds, Hearts ***Testing only***
	 * @param suit
	 * @return null
	 */
	public Pile groupBy(Suit suit) {
		
		return null;
	} // end groupBy suits

	/**
	 * Retrieves the size of the card pile
	 * @return size of pile
	 */
	public int size() {
		
		return cards.size();
	} //end size
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
		{
		
		String count = ("The pile currently has " + cards.size() + " cards");
		return count;
		}	// end toString()


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()


	/**
	 * Card iterator
	 */
	@Override
	public Iterator<Card> iterator() {

		return cards.iterator();
	}

	
}	// end class Pile
