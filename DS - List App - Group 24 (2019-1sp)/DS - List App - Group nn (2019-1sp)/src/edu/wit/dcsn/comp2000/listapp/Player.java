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

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Ryan Hale
 * @version
 *
 */
public class Player
	{
	private Hand hand ;
	private int set = 0;

	/**
	 * 
	 */
	public Player()
		{
		
		hand = new Hand();
		
		}	// end constructor
	
	/**
	 * Retrieves the set value
	 * @return set
	 */
	public int getSet() {
		return set;
	}
	
	/**
	 * Increments the set value
	 */
	public void incSet() {
		set++;
	}
	
	/**
	 * Retrieves the hand
	 * @return hand
	 */
	public Hand getHand() {
		
		return hand;
	}
	
	/**
	 * Formats the current player's card choice selection
	 * @return string of the players hand
	 */
	public String cardChoices() {
		
		String[] returnArray = new String[hand.getCards().size()];
		for (int i = 0; i < hand.getCards().size(); i++) {
			returnArray[i] = hand.getCard(i).getGraphic();
		}
		return Arrays.toString(returnArray);
	} //end cardChoices


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		
		getSetTest();
		incSetTest();
		getHandTest();
		cardChoicesTest();

		}	// end main()
	
	public static void getSetTest() {
		System.out.println("Testing getSet()...");
		
		Player player = new Player();
		player.incSet();
		player.incSet();
		
		System.out.print("Player set: " + player.getSet());
	}
	
	public static void incSetTest() {
		System.out.println("\n\nTesting incSet()...");
		Player player = new Player();
		System.out.println("Player set: " + player.getSet());
		System.out.println("Incrementing set...");
		player.incSet();
		System.out.println("Player set: " + player.getSet());
	}

	public static void getHandTest() {
		System.out.println("\n\nTesting getHand...");
		Player player = new Player();
		System.out.println("Player hand: " + player.getHand());
		
	}
	
	public static void cardChoicesTest() {
		System.out.println("\n\nTesting cardChoices()...");
		Player player = new Player();
		System.out.println("Player hand: " + player.cardChoices());
	}
	}	// end class Player
