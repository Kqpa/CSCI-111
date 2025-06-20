/* 
 * Bag.java
 * 
 * Computer Science S-111, Harvard University
 *
 * Modified by: <your name>, <your e-mail address>
 */

/**
 * An interface for the Bag ADT.
 */
public interface Bag {

    int capacity();
    boolean isFull();
    void increaseCapacity(int amount);
    boolean removeItems(Bag other);
    public Bag unionWith(Bag other);

    /** 
     * adds the specified item to the Bag.  Returns true on success
     * and false if there is no more room in the Bag.
     */
    boolean add(Object item);
    
    /** 
     * removes one occurrence of the specified item (if any) from the
     * Bag.  Returns true on success and false if the specified item
     * (i.e., an object equal to item) is not in the Bag.
     */
    boolean remove(Object item);
    
    /**
     * returns true if the specified item is in the Bag, and false
     * otherwise.
     */
    boolean contains(Object item);
    
    /**
     * returns true if the calling object contain all of the items in
     * otherBag, and false otherwise.  Also returns false if otherBag 
     * is null or empty. 
     */
    boolean containsAll(Bag otherBag);
    
    /**
     * returns the number of items in the Bag.
     */
    int numItems();
    
    /**
     * grab - returns a reference to a randomly chosen in the Bag.
     */
    Object grab();
    
    /**
     * toArray - return an array containing the current contents of the bag
     */
    Object[] toArray();
} 
