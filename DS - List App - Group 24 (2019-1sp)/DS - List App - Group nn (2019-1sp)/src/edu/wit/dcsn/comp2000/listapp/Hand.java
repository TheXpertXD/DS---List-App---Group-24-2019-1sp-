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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Elijah Park
 * @version 
 *
 */
public class Hand extends Pile
	{

	public static final int CARDS_IN_GAME = 13;
	private Map<Integer, Card> cards;

	
	public Hand()
		{
		cards = new HashMap<Integer, Card>();
		}	// end constructor
	



	

	@SuppressWarnings("unchecked")
	public List<Card> removeCards(int number){
		System.out.println("removing cards with number " + number);
		Card card = cards.get(number);
		cards.remove(number);
		return (List<Card>) card;
}

	
	public List<Card> removePairFromHand(int numberToRemove){
		return removeCards(numberToRemove);
}

	
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


	}	// end class Hand
