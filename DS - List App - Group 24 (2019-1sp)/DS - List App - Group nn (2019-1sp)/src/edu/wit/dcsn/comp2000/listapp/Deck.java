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
 * @author Andrew Zemko
 * @version 1.3
 *Set up deal() and made instance variables
 */
public class Deck extends Pile
	{

	private Pile cards = new Pile();
	private int deckCount = 52;

	public Deck()
		{
		
		}	// end constructor

	
	public void populateDeck() {
		for (Suit suit : Suit.values()) {
		    for (Rank rank : Rank.values()) {
		      cards.add(new Card(suit,rank));
		    }
		shuffle(cards.getPile());
		}
	}

	public Pile getCards() {
		return cards;
	}
	
	
	//Distributes cards to the players and gives the remainder to the pile
	//public void deal() {
		
		//Adds 5 cards to two hands
		//for (deckCount > 42; deckCount--) {
			
		//}
		//Adds remainder to the pile
		//for (deckCount > 0; deckCount--) {
			//pile.add();
		//}
//	} //end deal()
	
	
	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Deck
