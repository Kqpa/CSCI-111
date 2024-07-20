import java.util.*;

public class Dealer extends Player
{
    private boolean revealFirstCard;
    
    public Dealer()
    {
        super("dealer");
        revealFirstCard = false;
    }

    public void revealFirstCard()
    {
        this.revealFirstCard = true;
    }

    public void printHand()
    {
        if (!(this.revealFirstCard))
        {
            System.out.print("XX  ");
            for (int i = 1; i < super.getNumCards(); i++)
            {
                System.out.print(super.getCard(i) + "  ");
            }
        }
        else
        {
            super.printHand();
        }
        System.out.println();
    }

    public boolean wantsHit(Player opponent)
    {
/*         if (!(opponent.getHandValue() > 21))
        {
            if ((opponent.getHandValue() < 17) && (this.getHandValue() <= opponent.getHandValue()))
            {
                return true;
            }
            if (this.getHandValue() >= 17 && this.getHandValue() < opponent.getHandValue())
            {
                return true;
            }
        }
        return false; */
        int opponentHandValue = opponent.getHandValue();
        int dealerHandValue = this.getHandValue();
    
        // If the user’s hand has a value that is less than 17,
        // the dealer should take hits until the value of her hand exceeds the value of the user’s hand.
        if (opponentHandValue < 17) {
            return dealerHandValue <= opponentHandValue;
        }
    
        // If the user’s hand has a value of 17 or more,
        // the dealer should take hits until the value of her hand matches or exceeds the value of the user’s hand,
        // unless the user has Blackjack (in which case the dealer should hold, regardless of the value of her own hand).
        if (opponentHandValue >= 17 && !opponent.hasBlackjack()) {
            return dealerHandValue < opponentHandValue;
        }
    
        return false;
    }

    public void discardCards()
    {
        super.discardCards();
        this.revealFirstCard = false;
    }
}
