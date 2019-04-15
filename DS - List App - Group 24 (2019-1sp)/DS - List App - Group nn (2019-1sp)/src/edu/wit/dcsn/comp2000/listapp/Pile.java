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
import java.util.LinkedList;

/**
 * @author Andrew Zemko
 * @version 1.3
 * Implemented most methods including getter & toString
 *
 */
public class Pile
	{
	
	private LinkedList<Card> cards;		//Collection of card objects
	private int pileCount;				//Count of Cards remaining

	
	public Pile() {
		Pile pile = new Pile();
		pileCount = 0;
	}	// end constructor
	
	
	//Returns card on top of pile
	public Card getTop() {
		return cards.getFirst();
	}
	
	//Shuffles/Rearranges the list of card objects
	public void shuffle(LinkedList<Card> pile) {
		
		Collections.shuffle(pile);
	} // end shuffle
	
	
	//Adds a card object to the pile
	public void add(Card card) {
		
		this.add(card);
	} // end add
	
	
	//Removes a card object from the pile
	public void remove(Card card) {
		
		this.remove(card);
	} // end remove
	
	//Locates a desired card within the pile
	public Card findCard(Card card) {
		
		return null;
	} // end findCard
	
	
	//Sorts list into fourteen groups: ranks Ace-Joker in ascending order
	public Pile groupBy(Rank rank) {
		
		return null;
	} // end groupBy ranks
	
	
	//Sorts list into four groups: Spades, Clubs, Diamonds, Hearts
	public Pile groupBy(Suit suit) {
		
		return null;
	} // end groupBy suits

	public int size() {
		return cards.size();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
		{
		
		String count = ("The pile currently has " + pileCount + " cards");
		return count;
		}	// end toString()


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Pile
