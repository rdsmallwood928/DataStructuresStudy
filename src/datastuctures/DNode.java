package datastuctures;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/20/13
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class DNode<T> {

    public T nodeValue;
    public DNode prev;
    public DNode next;

    public DNode() {
        nodeValue = null;
        prev = this;
        next = this;
    }

    public DNode (T nodeValue) {
        this.nodeValue = nodeValue;
        prev = this;
        next = this;
    }
}
