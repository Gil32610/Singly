package src.main;

public class SinglyListNode {
    private SinglyListNode next;
    private Integer value;

    public SinglyListNode(Integer value, SinglyListNode next) {
        this.value = value;
        this.next = next;
    }

    public SinglyListNode getNext() {
        return this.next;
    }

    public void setNext(SinglyListNode next) {
        this.next = next;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {

        if (object instanceof SinglyListNode) {
            SinglyListNode aNode = (SinglyListNode) object;
            return this.getValue().equals(aNode.getValue());
        }
        return false;
    }
}