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

import java.util.LinkedList;
import java.util.List ;

/**
 * @author Andrew Zemko
 * @version 1.1
 * Added stubs for Pile methods
 *
 */
public class Pile
	{
	
	private LinkedList<Card> cards ;

	
	public Pile() {
		Pile pile = new Pile();
		
	}	// end constructor
	
	
	//Shuffles/Rearranges the list of card objects
	public void shuffle() {
		
	} // end shuffle
	
	
	//Adds a card object to the pile
	public void add() {
		
	} // end add
	
	
	//Removes a card object from the pile
	public void remove() {
		
	} // end remove
	
	
	//Locates a desired card within the pile
	public Card findCard(Card card) {
		
		return null;
	} // end findCard
	
	
	//Sorts list into fourteen groups: ranks Ace-Joker
	public Pile groupBy(Rank rank) {
		
		return null;
	} // end groupBy ranks
	
	
	//Sorts list into four groups: Spades, Clubs, Diamonds, Hearts
	public Pile groupBy(Suit suit) {
		
		return null;
	} // end groupBy suits

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
		{
		return null ;

		}	// end toString()


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Pile
