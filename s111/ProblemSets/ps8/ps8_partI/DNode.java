/*
 * DNode.java
 *
 * Computer Science S-111
 */

/*
 * A class for representing a string using a doubly-linked list.
 * Each character of the string is stored in a separate node.  
 *
 * This class represents one node of the linked list.  The string as a
 * whole is represented by storing a reference to the first node in
 * the linked list. Empty strings are represented using a value of null.
 */ 
public class DNode {
    private char ch;
    private DNode prev;
    private DNode next;

    /*
     * extra stuff
     */
    public static DNode intNexts(DNode last)
    {
        while (last.prev != null)
        {
            last.prev.next = last;
            last = last.prev;
        }
        return last;
    }
    /*
     * extra stuff
     */

    /*
     * Constructor
     */
    public DNode(char c, DNode p, DNode n) {
        this.ch = c;
        this.prev = p;
        this.next = n;
    }

    /*
     * convert - converts a standard Java String object to a doubly-linked
     * list and returns a reference to first node in that doubly-linked list
     */
    public static DNode convert(String s) {
        if (s.length() == 0) {
            return null;
        }

        DNode firstNode = new DNode(s.charAt(0), null, null);
        DNode prevNode = firstNode;
        DNode nextNode;

        for (int i = 1; i < s.length(); i++) {
            nextNode = new DNode(s.charAt(i), prevNode, null);
            prevNode.next = nextNode;
            prevNode = nextNode;
        }

        return firstNode;
    }

    /*
     * removeNexts - takes a reference to the first node in a
     * doubly-linked list, sets all of the next fields in the nodes
     * to null, and returns a reference to the last node in the
     * linked list.
     * 
     * This method can be used to create a scenario like the one
     * envisioned for the initNexts() method that you need to write for
     * Problem 3.
     */
    public static DNode removeNexts(DNode first) {
        DNode trav = first;
        DNode trail = null;   // will stay one behind trav

        while (trav != null) {
            // the order of these statements matters!
            trail = trav;
            trav = trav.next;
            trail.next = null;
        }

        // at the end of the loop, trail will be pointing
        // to the last node
        return trail;
    }

    // Problem 2
    public static DNode initNexts(DNode last) {
        while (last.prev != null)
        {
            last.prev.next = last;
            last = last.prev;
        }
        return last;
    }    

    /*
     * toString - creates and returns the Java string that
     * the current DNode represents.  Note that this
     * method is non-static method, and thus it won't work
     * for empty strings, since they are represented by a 
     * value of null, and we can't use null to invoke this method.
     */
    public String toString() {
        String str = "";
        
        DNode trav = this;   // start trav on the current node (this)
        while (trav != null) {
            str = str + trav.ch;
            trav = trav.next;
        }
         
        return str;
    }

    public static void main(String[] args) {
        DNode str = DNode.convert("crimson");
        System.out.println("\ninitial str: " + str);
        DNode last = DNode.removeNexts(str);
        System.out.println("after setting next fields to null: " + str);
        str = DNode.initNexts(last);
        System.out.println("after calling initNexts(): " + str);
    }
}
