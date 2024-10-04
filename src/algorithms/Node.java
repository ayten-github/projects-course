package algorithms;

public class Node<T> {
    T value;
    algorithms.Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

}
