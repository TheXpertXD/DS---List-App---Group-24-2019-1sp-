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

import java.util.Iterator;

/**
 * @author Elijah Park
 * @version 
 *
 */

public class Hand extends Pile {
	
	private Pile hand = new Pile();

	public Hand() {
		}	// end constructor
	
	
	/**
	 * Prints the current hand
	 */
	public void printHand() {
		for (int i = 0; i < hand.getPile().size(); i++) {
			System.out.print("------------");
		}
		System.out.println();
		Iterator<Card> handIterator = hand.getPile().iterator();
		while (handIterator.hasNext()) {
			Card output = handIterator.next();
			System.out.print(" | " + output.getRank().getGraphic() + " " + output.getSuit().getDisplayName());
		}
		System.out.print(" |");
		System.out.println();
		for (int i = 0; i < hand.size(); i++) {
			System.out.print("------------");
		}
	} // end printHand()
	
	
	/**
	 * Adds a card to the hand
	 * @param newCard
	 */
	public void addCard(Card newCard) {
		hand.add(newCard);
	} // end addCard()
	
	
	/**
	 * Retrieves a card from the hand at a specific index
	 * @param index
	 * @return the card at the index
	 */
	public Card getCard( int index) {
		return hand.get(index);
	} // end getCard()
	
	
	/**
	 * Retrieves the pile of cards from the hand
	 * @return pile of cards
	 */
	public Pile getCards() {
		return hand;
	} // end getCards()
		
	
	/**
	 * Non-Collection-based sort method. ***Testing purposes only***
	 */
	public void sort() {
		Pile tempHand = new Pile();
		Card[] sortingArray = new Card[hand.size()];
		Iterator<Card> handIterator = hand.iterator();
		for(int i = 0; i < hand.size(); i++) {
			if(handIterator.hasNext()) {
				sortingArray[i] = handIterator.next();
			}
		}
		for (int i = 0; i < sortingArray.length; i++) {
		
			for (int j = i; j < sortingArray.length; j++) {
			
				Card temp = sortingArray[i];
			
				try { 
					if ((Integer.parseInt(temp.getGraphic())) > (Integer.parseInt(sortingArray[j].getGraphic()))) {
						sortingArray[i] = sortingArray[j];
						sortingArray[j] = temp;
					}
				}
				catch(NumberFormatException e) {
					if ((temp.getGraphic().equals("A")) || (temp.getGraphic().compareTo(sortingArray[j].getGraphic()) > 0)) {
						sortingArray[i] = sortingArray[j];
						sortingArray[j] = temp;
					}
				}
			}	
		}
		for(int i = 0; i < sortingArray.length; i++) {
			tempHand.add(sortingArray[i]);
		}
		hand = tempHand;
	}	// end sort()

	
	/**
	 * Not implemented
	 */
	@Override
	public String toString() {
		return null ;
	}	// end toString()


}	// end class Hand
