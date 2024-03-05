package assignment4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Deck  {
    public void createDeck() {
        Scanner input = new Scanner(System.in);
        Vector<Card> deck = new Vector<Card>(52);

        // populate the deck with cards

        for (int rank = 1; rank <= 13; rank++) {
            for (String suit : Card.suits) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }

        // display the menu
        while (true) {
            System.out.println("***************************\n");
            System.out.println("1. Display the deck of cards");
            System.out.println("2. Shuffle the deck of cards");
            System.out.println("3. Draw a card from the deck");
            System.out.println("4. Empty the deck");
            System.out.println("5. Print a card from the deck");
            System.out.println("6. Compare two cards");
            System.out.println("7. Check if two cards are same");
            System.out.println("8. Find card by rank and suit");
            System.out.println("9. Deal a hand of cards");
            System.out.println("10. Quit");
            // get user choice
            System.out.print("Enter your choice (1-10): ");
            int choice = input.nextInt();

            System.out.println("***************************\n");

            // handle user choice
            switch (choice) {
                case 1:
                    displayDeck(deck);
                    break;
                case 2:
                    shuffleDeck(deck);
                    break;
                case 3:
                    drawCard(deck);
                    break;
                case 4:
                    emptyDeck(deck);
                    break;
                case 5:
                    printCard(deck);
                    break;
                case 6:
                    compareCard(deck);
                    break;
                case 7:
                    sameCard(deck);
                    break;
                case 8:
                    findCard(deck);
                    break;
                case 9:
                    dealHand(deck);
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Case 1: Display the deck of cards
    private void displayDeck(Vector<Card> deck) {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Case 2: Shuffle the deck of cards
    private void shuffleDeck(Vector<Card> deck) {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully.");
    }

    // Case 3: Draw a card from the deck
    private void drawCard(Vector<Card> deck) {
        if (!deck.isEmpty()) {
            Card drawnCard = deck.remove(0);
            System.out.println("You drew: " + drawnCard);
        } else {
            System.out.println("The deck is empty. Cannot draw a card.");
        }
    }

    // Case 4: Empty the deck
    private void emptyDeck(Vector<Card> deck) {
        deck.clear();
        System.out.println("Deck emptied successfully.");
    }

    // Case 5: Print a card from the deck
    private void printCard(Vector<Card> deck) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the card to print (0-" + (deck.size() - 1) + "): ");
        int index = input.nextInt();
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Case 6: Compare two cards
    private void compareCard(Vector<Card> deck) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the indices of the two cards to compare (0-" + (deck.size() - 1) + "): ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();

        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);
            System.out.println("Comparison result: " + card1.compareTo(card2));
        } else {
            System.out.println("Invalid indices.");
        }
    }

    // Case 7: Check if two cards are same
    private void sameCard(Vector<Card> deck) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the indices of the two cards to check (0-" + (deck.size() - 1) + "): ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();

        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);
            System.out.println("Equality result: " + card1.equals(card2));
        } else {
            System.out.println("Invalid indices.");
        }
    }

    // Case 8: Find card by rank and suit
    private void findCard(Vector<Card> deck) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rank and suit of the card to find (rank suit): ");
        int rank = input.nextInt();
        String suit = input.next();

        Card targetCard = new Card(rank, suit);
        int index = deck.indexOf(targetCard);

        if (index != -1) {
            System.out.println("Card found at index: " + index);
        } else {
            System.out.println("Card not found in the deck.");
        }
    }

    // Case 9: Deal a hand of cards
    private void dealHand(Vector<Card> deck) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cards to deal: ");
        int numCards = input.nextInt();

        if (numCards <= deck.size()) {
            System.out.println("Your hand:");
            for (int i = 0; i < numCards; i++) {
                Card card = deck.remove(0);
                System.out.println(card);
            }
        } else {
            System.out.println("Not enough cards in the deck.");
        }
    }
}
