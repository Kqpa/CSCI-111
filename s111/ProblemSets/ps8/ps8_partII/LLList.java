/*
 * LLList.java
 *
 * Computer Science S-111, Harvard University
 * 
 * Modified by: Bora Evinç, bevinc26@my.aci.k12.tr
 */

import java.util.*;

/*
 * A class that implements our simple List interface using a linked list.
 * The linked list includes a dummy head node that allows us to avoid
 * special cases for insertion and deletion at the front of the list.
 */
public class LLList implements List {
    // Inner class for a node.  We use an inner class so that the LLList
    // methods can access the instance variables of the nodes.
    private class Node {
        private Object item;
        private Node next;
        
        private Node(Object i, Node n) {
            item = i;
            next = n;
        }
        public String toString()
        {
            return this.item + "";
        }
    }
    
    // fields of the LLList object
    private Node head;     // dummy head node
    private int length;    // # of items in the list
    
    public void rotate(int k)
    {
        if (k < 0 || k > length)
        {
            throw new IllegalArgumentException();
        }
        if (k == 0 || k == length)
        {
            return;
        }

        int startIndex = this.length - k;
        int endIndex = startIndex - 1;

        Node startNode = this.getNode(startIndex);
        Node newHead = new Node(startNode.item, null);
        Node trav = newHead;

        for (int i = startIndex + 1; i < length; i++)
        {
            startNode = startNode.next;
            trav.next = new Node(startNode.item, null);
            trav = trav.next;
        }

        startNode = this.getNode(0);
        trav.next = new Node(startNode.item, null);
        trav = trav.next;

        for (int i = 1; i <= endIndex; i++)
        {
            startNode = startNode.next;
            trav.next = new Node(startNode.item, null);
            trav = trav.next;
        }
        head.next = newHead;
    }    /*
     * Constructs a LLList object for a list that is initially empty.
     */
    public LLList() {
        head = new Node(null, null);
        length = 0;
    }
    
    /*
     * Constructs an LLList object containing the items in the specified array
     */
    public LLList(Object[] initItems) {
        head = new Node(null, null);
        
        Node prevNode = head;
        for (int i = 0; i < initItems.length; i++) {
            Node nextNode = new Node(initItems[i], null);
            prevNode.next = nextNode;
            prevNode = nextNode;
        }
        
        length = initItems.length;
    }
    
    /* 
     * length - returns the number of items in the list 
     */
    public int length() {
        return length;
    }
    
    /* 
     * isFull - always returns false, because the linked list can
     * grow indefinitely and thus the list is never full.
     */
    public boolean isFull() {
        return false;
    }
    
    /* 
     * getNode - private helper method that returns a reference to the
     * ith node in the linked list.  It assumes that the value of the
     * parameter is valid.  
     * 
     * If i == -1, it returns a reference to the dummy head node.
     */
    private Node getNode(int i) {
        Node trav = head;
        int travIndex = -1;
        
        while (travIndex < i) {
            travIndex++;
            trav = trav.next;
        }
        
        return trav;
    }
    
    /* 
     * getItem - returns the item at position i in the list 
     */
    public Object getItem(int i) {
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException();
        }
        
        Node n = getNode(i);
        return n.item;
    }
    
    /* 
     * addItem - adds the specified item at position i in the list,
     * shifting the items that are currently in positions i, i+1, i+2,
     * etc. to the right by one.  Always returns true, because the list
     * is never full.
     *
     * We don't need a special case for insertion at the front of the
     * list (i == 0), because getNode(0 - 1) will return the dummy
     * head node, and the rest of insertion can proceed as usual.
     */
    public boolean addItem(Object item, int i) {
        if (item == null || i < 0 || i > length) {
            throw new IllegalArgumentException();
        }
        
        Node newNode = new Node(item, null);
        Node prevNode = getNode(i - 1);           
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        
        length++;
        return true;
    }
    
    /* 
     * removeItem - removes the item at position i in the list,
     * shifting the items that are currently in positions i+1, i+2,
     * etc. to the left by one.  Returns a reference to the removed
     * object.
     *
     * Here again, we don't need a special case for i == 0 (see the
     * note accompanying addItem above).
     */
    public Object removeItem(int i) {
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException();
        }
        
        Node prevNode = getNode(i - 1);           
        Object removed = prevNode.next.item;
        prevNode.next = prevNode.next.next;
        
        length--;
        return removed;
    }
    
    /*
     * toString - converts the list into a String of the form 
     * {item0, item1, ...}
     */
    public String toString() {
        String str = "{";
        
        Node trav = head.next;    // skip over the dummy head node
        while (trav != null) {
            str = str + trav.item;
            if (trav.next != null) {
                str = str + ", ";
            }
            trav = trav.next;
        }
        
        str = str + "}";
        return str;
    }
    
    /*
     * iterator - returns an iterator for this list
     */
    public ListIterator iterator() {
        return new LLListIterator();
    }
    
    /*
     * private inner class for an iterator over an LLList
     */
    private class LLListIterator implements ListIterator {
        private Node nextNode;       // the next node to visit    
        
        public LLListIterator() {
            nextNode = head.next;    // skip over the dummy head node
        }
        
        /*
         * hasNext - does the iterator have additional items to visit?
         */
        public boolean hasNext() {
            return (nextNode != null);
        }
        
        /*
         * next - returns a reference to the next Object in the iteration
         */
        public Object next() {
            if (nextNode == null) {
                throw new NoSuchElementException();
            }
            
            Object item = nextNode.item;
            nextNode = nextNode.next;
            return item;
        }
    }
}
