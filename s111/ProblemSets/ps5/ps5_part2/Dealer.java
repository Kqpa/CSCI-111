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
    }

    public boolean wantsHit(Player opponent)
    {
         if (!(opponent.getHandValue() > 21))
        {
            if ((opponent.getHandValue() < 17) && (this.getHandValue() <= opponent.getHandValue()))
            {
                return true;
            }
            if (this.getHandValue() >= 17 && (this.getHandValue() < opponent.getHandValue()))
            {
                return true;
            }
        }
        return false;
    }

    public void discardCards()
    {
        super.discardCards();
        this.revealFirstCard = false;
    }
}
