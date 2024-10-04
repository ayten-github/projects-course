package algorithms;

class LinkedList<T> {
    public Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void addHead(T value) {
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
    }

    public void addTail(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) head = node;
        else {
            Node<T> tNode = head;
            while (tNode.next != null) {
                tNode = tNode.next;
            }
        }
    }

    public void removeTail() {
        if (head == null) return;
        if (head.next == null) head = null;
        Node<T> tNode = head;
        while (tNode.next.next != null) {
            tNode = tNode.next;
        }
        tNode.next = null;
    }

    public void removeHead() {
        if (head == null) return;
        head = head.next;
    }

    public void insert(int index, T value) {
        Node<T> tNode = new Node<>(value);
        if (index < 0) System.out.println("There is no such a index");
        if (index == 0) {
            tNode.next = head;
            head = tNode;
            return;
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }
        if (current != null) tNode.next = current.next;
        else tNode.next = null;
        if (current != null) current.next = tNode;
        else addTail(value);

    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void update(int index, T value) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) throw new IndexOutOfBoundsException("index out of bound");
            current = current.next;
        }
        if (current != null) current.value = value;
        else throw new IndexOutOfBoundsException("index out of bound");
    }

    public void delete(int index) {
        if (head == null) {
            System.out.println("your list is empty pls add something");
            return;
        }
        if (index == 0) head = head.next;
        if (index < 0) {
            System.out.println("index can't be negative");
            return;
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("index out or bound");
            }
            current = current.next;
        }
        if (current.next != null) current.next = current.next.next;
        else throw new IndexOutOfBoundsException();
    }

    public void delete(T value) {
        if (head == null) System.out.println("list is empty pls add something");
        if (head.value.equals(value)) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.value.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("there is not such a value");

    }

    public void deleteAll() {
        head = null;
    }

    public Object[] toArray() {
        Object[] array = new Object[size()];
        int sizeOfArray = 0;
        Node<T> tNode = head;
        while (tNode.next != null) {
            array[sizeOfArray++] = tNode;
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
        ll.delete(2);
        System.out.println(ll);
        System.out.println(ll.size());
        ll.removeHead();
        System.out.println(ll);
        ll.insert(1, "char");
        System.out.println(ll);
        ll.update(1, "long");
        System.out.println(ll);
        ll.delete("char");
        System.out.println(ll);
        ll.removeTail();
        System.out.println(ll);
        ll.delete("byte");
        System.out.println(ll);
    }
}

