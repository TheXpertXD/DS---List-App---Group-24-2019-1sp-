package edu.wit.dcsn.comp2000.listapp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Game {
	
	public static int[] playerSelection(int currentPlayerNum, int totalPlayerCount) {
		int num = 0;
		int index = 0;
		int[] players = new int[totalPlayerCount - 1];
		for(int i = 0; i < totalPlayerCount; i++) {
			if(currentPlayerNum == num) {
				num++;
				continue;
			}
			players[index] = num;
			num++;
			index++;
			}
		return players;
	}
	
	public static boolean targetPlayerValidation(int target, int[] targetArray) {
		boolean validated = false;
		for(int i = 0; i < targetArray.length; i++) {
			if(targetArray[i] == target) {
				validated = true;
			}
		}
		return validated;
	}
	
	public static boolean targetCardValidation(String selectedCard, Hand hand) {
		boolean validated = false;
		for(int i = 0; i < hand.getCards().size(); i++) {
			if(hand.getCard(i).getGraphic().equals(selectedCard)) {
				validated = true;
			}
		}
		return validated;
	}
	
	public static int calculateWinner(Player[] players) {
		
		int winner = 0;
		int setCount = 0;
		for (int i = 0; i < players.length; i++) {
			if (players[i].set > setCount) {
				setCount = players[i].set;
				winner = i;
			}
		}
		return winner;
	}
	
	public static void printGameBanner() {
		System.out.println("************************************************");
		System.out.println("*  $$$$$    $$$$    $$$$$$$ $$  $$$$$  $$   $$ *");
		System.out.println("* $$   $$  $$  $$   $$      $$  $$  $  $$   $$ *");
		System.out.println("* $$       $$  $$   $$$$$$  $$  $$$    $$$$$$$ *");
		System.out.println("* $$  $$$  $$  $$   $$      $$    $$$  $$$$$$$ *");
		System.out.println("* $$   $$  $$  $$   $$      $$  $  $$  $$   $$ *");
		System.out.println("*  $$$$$    $$$$    $$      $$  $$$$$  $$   $$ *");
		System.out.println("***********************************************");
	}
	
	public static void printDivider() {
		System.out.println("\n**********************************************************************************************************");
		System.out.println("**********************************************************************************************************");
	}
	public static void main( String[] args ) {
		
		Scanner scanner = new Scanner(System.in);
		int playerCount = 0;
		boolean validPlayerCount = false;
		Player[] players;
		int cardCount = 0;
		
		//	Get the playerCount
		while(!validPlayerCount) {
		System.out.print("How many players [2 - 4]: ");
		playerCount = scanner.nextInt();
		if ((playerCount > 1) && (playerCount < 5)) {
			validPlayerCount = true;
		}
		else {
			System.out.println("Between 2 and 4 players please...");
		}
		};
		
		//	Get the cardCount
		switch(playerCount) {
			
			case 2:
				cardCount = 7;
				break;
			case 3:
				cardCount = 6;
				break;
			case 4:
				cardCount = 5;
				break;
		}
		
		//	Initialize the deck
		Deck deck = new Deck();
		deck.populateDeck();
		deck.shuffle();
		
		//	Initialize the players array
		players = new Player[playerCount];
		//	Populate the players array
		for (int i = 0; i < playerCount; i++) {
			players[i] = new Player();
		}
		
		//	Populate the hands for the players
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < cardCount; j++) {
				players[i].getHand().addCard(deck.drawCard());
			}
		}
		
		//	Populate goFishPile with contents of Deck
		Pile goFishPile = new Pile();
		for (int i = 0; i < deck.index; i++) {
			goFishPile.add(deck.getCards()[i]);
		}
		
		//	Begin Game
		printGameBanner();
		boolean winner = false;
		int targetPlayer = 0;
		String targetCard = "";
		
		while(!winner) {
		
			for (int currentPlayer = 0; currentPlayer < playerCount; currentPlayer++) {
				
				//	Print Hands
				
				System.out.println("\nRemaining cards in the pile: " + goFishPile.size());
				for (int i = 0; i < playerCount; i++) {
					System.out.println("\nPlayer " + i + "'s hand:");
					players[i].getHand().sort();
					players[i].getHand().printHand();
					System.out.println("Sets: " + players[i].set);
				}
				
				//	Create int array of valid targets
				int[] targets = playerSelection(currentPlayer, playerCount);
				boolean validTargetPlayer = false;
				System.out.println("\nPlayer " + currentPlayer + " turn...\n");
				
				//	Select and validate target
				while(!validTargetPlayer) {
					System.out.print("Please select a player " + Arrays.toString(targets) + ": ");
					
					while(!scanner.hasNextInt()) {
						System.out.println("This is not a valid player.");
						scanner.next();
					}
					targetPlayer = scanner.nextInt();
					if(targetPlayerValidation(targetPlayer, targets)) {
						validTargetPlayer = true;
					}
				}
				
				//	Select card to ask for
				boolean validTargetCard = false;
				while(!validTargetCard) {
					System.out.print("Please select a card to ask from player " + targetPlayer + ": " + players[currentPlayer].cardChoices() + ":");
					
					targetCard = scanner.next();
					
					switch (targetCard) {
						case "j":
							targetCard = "J";
							break;
						case "q":
							targetCard = "Q";
							break;
						case "k":
							targetCard = "K";
							break;
						case "a":
							targetCard = "A";
							break;
					}
					
					if(targetCardValidation(targetCard, players[currentPlayer].getHand()) ) {
						validTargetCard = true;
					}
				}
				
				// Ask for another card
				System.out.println("Player " + targetPlayer + ", do you have any " + targetCard + "'s?");
				if (targetCardValidation(targetCard, players[targetPlayer].getHand())) {
					Iterator<Card> targetHandIterator = players[targetPlayer].getHand().getCards().iterator();
					System.out.println("\nYes, I have a " + targetCard + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					while(targetHandIterator.hasNext()) {
						Card possibleMatch = targetHandIterator.next();
						if(possibleMatch.getGraphic().equals(targetCard)) {
						players[currentPlayer].getHand().addCard(possibleMatch);
						targetHandIterator.remove();
						}
					}
				players[currentPlayer].getHand().sort();
				
				int count;
				String checkSetCurrentValue;
				for(int i = 0; i < players[currentPlayer].getHand().getCards().size(); i++) {
					count = 0;
					checkSetCurrentValue = players[currentPlayer].getHand().getCard(i).getGraphic();
					for(int j = 0; j < players[currentPlayer].getHand().getCards().size(); j++) {
						if(checkSetCurrentValue.equals(players[currentPlayer].getHand().getCard(j).getGraphic())) {
							count++;
							//System.out.println("Count of " + checkSetCurrentValue + " is " + count);
						}
					}
					Iterator<Card> handIterator = players[currentPlayer].getHand().getCards().iterator();
					if(count == 4) {
						System.out.println("Set of " + checkSetCurrentValue + " found!");
						players[currentPlayer].set++;
						while(handIterator.hasNext()) {
							if (handIterator.next().getGraphic().equals(checkSetCurrentValue)) {
								handIterator.remove();
							}
						}
					}
				}
				}
				else {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nGo Fish!");
					System.out.println("Drew: " + goFishPile.getFirst());
					players[currentPlayer].getHand().addCard(goFishPile.getFirst());
					goFishPile.removeFirst();
					players[currentPlayer].getHand().sort();
					
				}
				if((players[currentPlayer].getHand().getCards().isEmpty()) || (goFishPile.isEmpty())) {	
					winner = true;
				}
				printDivider();
		
		}
		
		}
		
		//	Calculate winner

		System.out.println("Player " + calculateWinner(players) + " wins!!!");
	
	}
}