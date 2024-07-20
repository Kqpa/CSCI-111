import java.util.Scanner;

public class Player
{
    private String name;
    private int numCards;
    private Card[] hand;

    public Player(String name)
    {
        this.name = name;
        hand = new Card[Blackjack.MAX_CARDS_PER_PLAYER];
    }

    public String getName()
    {
        return this.name;
    }

    public int getNumCards()
    {
        return this.numCards;
    }

    public void addCard(Card c)
    {
        if (c == null || numCards == Blackjack.MAX_CARDS_PER_PLAYER)
        {
            throw new IllegalArgumentException();
        }
        hand[numCards] = c;
        numCards++;
    }

    public Card getCard(int i)
    {
        if (i < 0 || i >= numCards)
        {
            throw new IllegalArgumentException();
        }
        return hand[i];
    }

    public int getHandValue()
    {
        int total = 0;
        int aceCount = 0;
        for (int i = 0; i < numCards; i++)
        {
            Card t = hand[i];
            if (t.isAce() && aceCount == 0 && (total + 11) <= 21)
            {
                total += 11;
                aceCount++;
            }
            else
            {
                total += hand[i].getValue();
            }
        }
        return total;
    }

    public void printHand()
    {
        for (int i = 0; i < numCards; i++)
        {
            System.out.print(hand[i] + "  ");
        }
        System.out.print("(value = " + this.getHandValue() + ")");
    }

    public boolean hasBlackjack()
    {
        return (numCards == 2) && (getHandValue() == 21);
    }

    public boolean wantsHit(Scanner console, Player opponent)
    {
        System.out.print("Want another hit, " + this.getName() + " (y/n)? ");
        char option = console.nextLine().toLowerCase().charAt(0);
        if (option == 'y')
        {
            return true;
        }
        return false;
    }

    public void discardCards()
    {
        hand = new Card[Blackjack.MAX_CARDS_PER_PLAYER];
        numCards = 0;
    }
}
