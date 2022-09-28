package src.main;

public class SinglyLinkedList {
    private SinglyListNode head;

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(Integer value) {
        SinglyListNode node = new SinglyListNode(value);
        if (isEmpty()) {
            this.head = node;
        } else {
            node.setNext(this.head);
            this.head = node;

        }

    }

    public SinglyListNode search(Integer value) {
        SinglyListNode search;
        if (isEmpty()) {
            return null;
        } else {
            search = this.head;
            while (search != null) {
                if (search.getValue().compareTo(value) == 0) {
                    return search;

                } else {
                    search = search.getNext();
                }
            }
            return null;
        }
    }

    public int size() {
        SinglyListNode aux = this.head;
        int size = 0;
        while (aux != null) {
            aux = aux.getNext();
            size++;
        }
        return size;
    }

    public boolean isOrdered(boolean ascending) {
        if (isEmpty()) {
            return false;
        } else {
            SinglyListNode node = this.head;
            if (ascending) {
                while (node != null) {
                    Integer value = node.getValue();

                    if (value > node.getNext().getValue()) {
                        return false;
                    }

                    else {
                        node = node.getNext();
                    }
                }
                if (node == null) {
                    return true;
                }

            } else {
                while (node != null) {
                    Integer value = node.getValue();
                    if (value < node.getNext().getValue()) {
                        return false;
                    } else {
                        node = node.getNext();
                    }
                    if (node == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
