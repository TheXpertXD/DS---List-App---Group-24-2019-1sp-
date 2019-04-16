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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Elijah Park
 * @version 
 *
 */
public class Hand extends Pile
	{

	Pile hand = new Pile();
	public static final int CARDS_IN_GAME = 13;
	private Map<Integer, Card> cards;

	
	public Hand()
		{
		
		}	// end constructor
	
	
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
	}
	
	public void addCard(Card newCard) {
		hand.add(newCard);
	}
	
	//public Card removeCard( Card card ) {
		
		//return hand.remove(card);
//	}
	
	public Card getCard( int index) {
		return hand.get(index);
	}
	
	public Pile getCards() {
		return hand;
	}
		
	public void sort()
	{
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

	@SuppressWarnings("unchecked")
	public List<Card> removeCards(int number){
		System.out.println("removing cards with number " + number);
		Card card = cards.get(number);
		cards.remove(number);
		return (List<Card>) card;
}

	
	public List<Card> removePairFromHand(int numberToRemove) {
		
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
