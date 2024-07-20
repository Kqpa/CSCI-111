/**
 * Card.java
 * 
 * A blueprint class to represent an individual playing card.
 * 
 * starter code: CSCI S-111, Harvard University
 * 
 * completed by: Bora Evinç, bevinc26@my.aci.k12.tr
 */

 public class Card
 {
    // constants for the ranks of non-numeric cards
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    // other constants for the ranks
    public static final int FIRST_RANK = 1;
    public static final int LAST_RANK = 13;
    
    // Arrays of strings for the rank names and abbreviations.
    // The name of the rank r is given by RANK_NAMES[r].
    // The abbreviation of the rank r is given by RANK_ABBREVS[r].
    private static final String[] RANK_NAMES = {
      null, "Ace", "2", "3", "4", "5", "6", 
      "7", "8", "9", "10", "Jack", "Queen", "King"
    };
    private static final String[] RANK_ABBREVS = {
      null, "A", "2", "3", "4", "5", "6",
      "7", "8", "9", "10", "J", "Q", "K"
    };
    
    // constants for the suits
    public static final int FIRST_SUIT = 0;
    public static final int LAST_SUIT = 3;
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int SPADES = 3;
    
    // Arrays of strings for the suit names and abbreviations.
    // The name of the suit s is given by SUIT_NAMES[s].
    // The abbreviation of the suit s is given by SUIT_ABBREVS[s].
    private static final String[] SUIT_NAMES = {
      "Clubs", "Diamonds", "Hearts", "Spades"
    };
    private static final String[] SUIT_ABBREVS = {
      "C", "D", "H", "S"
    };
    
    /***** part 2: getSuitNum *****/
    private static int getSuitNum(String suit)
    {
        for (int i = 0; i < SUIT_NAMES.length; i++)
        {
            if (SUIT_NAMES[i].equalsIgnoreCase(suit))
            {
                return i;
            }
        }
        return -1;
    }

    /***** Implement parts 3-7 below. *****/

    public int rank;
    public int suitNum;

    public Card(int rank, int suitNum)
    {
      if (!(rank <= 13 && rank >= 1))
      {
        throw new IllegalArgumentException("The rank value must be between 1 and 13, inclusive.");
      }
      if (!(suitNum <= 3 && suitNum >= 0))
      {
        throw new IllegalArgumentException("The suitNum value must be between 0 and 3, inclusive.");
      }
      this.rank = rank;
      this.suitNum = suitNum;
    }
    
    public Card(int rank, String suitName)
    {
      this(rank, getSuitNum(suitName));
    }

    public int getRank()
    {
      return this.rank;
    }
    
    public String getRankName()
    {
      return RANK_NAMES[this.rank];
    }

    public int getSuitNum()
    {
      return this.suitNum;
    }

    public String getSuitName()
    {
      return SUIT_NAMES[this.suitNum];
    }

    /*
     * "$rank_name of $suit_name"
     */
    public String getName()
    {
      return getRankName() + " of " + getSuitName();
    }

    public boolean isAce()
    {
      return (this.rank == 1);
    }

    public boolean isFaceCard()
    {
      return ((this.rank == 11) || (this.rank == 12) || (this.rank == 13));
    }

    public int getValue()
    {
      if (isFaceCard())
      {
        return 10;
      }
      return this.rank;
    }

    public String toString()
    {
      return RANK_ABBREVS[this.rank] + SUIT_ABBREVS[this.suitNum];
    }
    
    public boolean sameSuitAs(Card c)
    {
      if (c != null)
      {
        return this.suitNum == c.suitNum;
    
      }
      return false;
    }

    public boolean equals(Card c)
    {
      if (c != null)
      {
        return sameSuitAs(c) && (this.rank == c.rank);
      }
      return false;
    }
}