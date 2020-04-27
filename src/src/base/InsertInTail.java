package src.base;

/**
 * 尾插法倒序遍历链表
 *
 * @author xixi
 */
public class InsertInTail {
    public static void main(String[] args) {
        ListNode<Integer>[] listNodes = new ListNode[5];
        listNodes[0] = new ListNode<>(0, null);
        for (int i = 1; i < 5; i++) {
            listNodes[i] = new ListNode<>(i, listNodes[i - 1]);
        }

        //创建一个指向单链表头部的节点
        ListNode head = new ListNode();
        head.setNext(listNodes[4]);
        ListNode p, q;
        p = head.getNext();
        head.setNext(null);
        q = head;
        while (p != null) {
            q.setNext(p);
            p = p.getNext();
            q = q.getNext();
        }

        while(head.getNext()!= null){
            System.out.println(head.getNext().getValue());
            head = head.getNext();
        }
    }
}
