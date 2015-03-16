/**
 * Created by jimtryon on 1/13/15.
 */
public class MyLinkedList {
    // fields: what does a linked list have?
    private Node beginMarker;       // pointer to the first node
    private Node endMarker;         // pointer to the last node
    private int theSize;            // size of the list

    // variable for an iterator - save this for now

    // methods: what can a linked list do?
    public MyLinkedList() {
        // set up an empty list
        beginMarker = new Node(-1, null, null);
        endMarker = new Node(-1, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;


    }

    public void clear() {
        doClear();
    }

    prviate void do_clear() {
        // set up an empty list
        beginMarker = new Node(-1, null, null);
        endMarker = new Node(-1, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;
    }

    // Add a new node that contains x before Node p
    public void addBefore(Node p, int x) {
        // create the new node to contain the value x
        Node newNode = new Node(6, p.prev, p);
        // reset the pointer to the new node
        p.prev.next = newNode;
        // reset the pointer to the previous node
        p.prev = newNode;
        // increase size by 1
        theSize++;


    }

    // Remove a node
    public void remove(Node p) {
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize = theSize - 1;
    }

    private Node getNode(int idx) {
        if (idx < 0 || idx >= theSize)
        {
            throw new IndexOutOfBoundsException();
        }

        Node p = beginMarker;
        for (int i = 0; i < idx; i++) {
            p = p.next;
        }

        return p;
    }

    public void add(int position, int value) {
        Node p = getNode(position);
        addBefore(p, value);
    }

    public void remove(int position) {
        Node p = getNode(position);
        remove(p);
    }
}
