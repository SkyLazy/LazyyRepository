package src.base;

public class ListNode<T> {
    private T value;
    private ListNode next;
    ListNode() {

    }

    ListNode(T value, ListNode node) {
        this.value = value;
        next = node;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}