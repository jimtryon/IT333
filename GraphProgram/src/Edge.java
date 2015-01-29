/**
 * Created by jtryon on 1/29/15.
 */

public class Edge {
    Node from;
    Node to;
    String edgeData;

    public Edge(Node f, Node t, String eData) {
        from = f;
        to = t;
        edgeData = eData;
    }
}
