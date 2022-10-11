package src.main;

public class Utils {

    public static SinglyLinkedList sum(SinglyLinkedList listAddendOne, SinglyLinkedList listAddendTwo) {

        SinglyLinkedList sum = new SinglyLinkedList();
        SinglyListNode current1 = listAddendOne.getHead();
        SinglyListNode current2 = listAddendTwo.getHead();
        listAddendOne.reverse();
        listAddendTwo.reverse();
        int carryOne = 0;

        while (current1 != null || current2 != null || carryOne > 0) {
            int summing = carryOne;

            if (current1 != null) {
                summing += current1.getValue();
                current1 = current1.getNext();
            }
            if (current2 != null) {
                summing += current2.getValue();
                current2 = current2.getNext();
            }
            int digit = summing % 10;
            carryOne = summing / 10;
            sum.addFirst(digit);
        }
        sum.reverse();
        return sum;
    }
}
