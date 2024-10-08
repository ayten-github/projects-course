package algorithms;

import org.junit.Before;
import org.junit.Test;

import java.nio.file.OpenOption;
import java.util.Optional;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public Node<T> addHead(final T value) {
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
        size++;
        return node;
    }

    public Node<T> addTail(T value) {
        final Node<T> node = new Node<>(value);
        Node<T> current = head;
        size++;
        if (head == null) {
            head = node;
            return head;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return current;
    }

    public Optional<T> removeTail() {
        if (head == null) return Optional.empty();
        if (head.next == null) {
            head = null;
            return Optional.ofNullable(null);
        }
        Node<T> tNode = head;
        while (tNode.next.next != null) {
            tNode = tNode.next;
        }
        T removed = tNode.next.value;
        tNode.next = null;
        size--;
        return Optional.of(removed);
    }

    public Optional<T> removeHead() {
        if (head == null) return Optional.empty();
        T removed = head.value;
        head = head.next;
        size--;
        return Optional.of(removed);
    }

    public Optional<T> insert(int index, final T value) {
        Node<T> tNode = new Node<>(value);
        if (index < 0 || index < size) return Optional.empty();
        if (index == 0) {
            addHead(value);
            return Optional.of(value);
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        tNode.next = current.next;
        current.next = tNode;
        return Optional.of(current.value);
    }

    public boolean update(int index, final T value) {
        if (index < 0 || index >= size) return false;
        Node<T> tNode = head;
        for (int i = 0; i < index; i++) {
            tNode = tNode.next;
        }
        tNode.value = value;
        return true;
    }

    public boolean delete(final int index) {
        if (index < 0 || index >= size) {
            System.out.println("not valid input");
            return false;
        }
        if (head == null) {
            System.out.println("your list is empty pls add something");
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
        return true;
    }

    public boolean delete(final T value) {
        if (head == null) {
            System.out.println("list is empty pls add something");
            return false;
        }
        if (head.value.equals(value)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.value.equals(value)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void deleteAll() {
        head = null;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        int sizeOfArray = 0;
        Node<T> tNode = head;
        while (tNode.next != null) {
            array[sizeOfArray++] = tNode.value;
            tNode = tNode.next;
        }
        return array;
    }

    @Override
    public String toString() {
        Node<T> tNode = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (tNode != null) {
            stringBuilder.append(tNode.value).append(" ");
            tNode = tNode.next;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addHead("integer");
        ll.addHead("string");
        ll.addHead("boolean");
        System.out.println(ll);
        ll.addTail("short");
        System.out.println(ll);
        System.out.println(ll.delete(2));
        System.out.println(ll);
        System.out.println(ll);
        ll.insert(1, "char");
        System.out.println(ll);
        ll.update(1, "long");
        System.out.println(ll);
        ll.delete("char");
        System.out.println(ll);
        // ll.removeTail();
        //   System.out.println(ll);
        ll.delete("byte");
        System.out.println(ll);
    }

    @Before
    public void setUp() {

    }

    @Test
    public void addLinkedListShouldReturnSuccess() {

    }
}

