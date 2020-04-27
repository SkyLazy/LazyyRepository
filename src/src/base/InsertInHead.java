package src.base;

/**
 * 头插法 倒序遍历单链表
 * 必须要有三个变量完成，l头部，p，q表示节点
 * @author xixi
 */
public class InsertInHead {
    public static void main(String[] args) {
        //创建有5个节点的单链表
        ListNode<Integer>[] listNodes = new ListNode[5];
        listNodes[0] = new ListNode<>(0, null);
        for (int i = 1; i < 5; i++) {
            listNodes[i] = new ListNode<>(i, listNodes[i - 1]);
        }

        //创建一个指向单链表头部的节点
        ListNode l = new ListNode();
        l.setNext(listNodes[4]);


        //遍历链表
        ListNode p, q;
        p = l.getNext();
        //必须要断掉l的后续，不然会形成最后一个节点指向自己，在遍历的时候就会无限循环
        l.setNext(null);

        while (p != null) {
            q = p;
            p = p.getNext();

            q.setNext(l.getNext());
            l.setNext(q);
        }

        while (l.getNext() != null){
            System.out.println(l.getNext().getValue());
            l = l.getNext();
        }
    }
}
