package sample.day2;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode tl = l1;
        ListNode tl2 = l1;
        ListNode r1 = new ListNode(2);
        ListNode tr = r1;
        ListNode tr2 = r1;
        for (int i = 0; i < 3; i++) {
            tl.next = new ListNode(tl.val + i * 3);
            tr.next = new ListNode(tr.val + 2 * (i + 1));
            tl = tl.next;
            tr = tr.next;
        }
        while (tr2 != null) {
            System.out.print(tr2);
            tr2 = tr2.next;
        }
        System.out.println();
        while (tl2 != null) {
            System.out.print(tl2);
            tl2 = tl2.next;
        }
        System.out.println();
        ListNode ld = mergeTwoLists(l1, r1);
        while (ld != null) {
            System.out.print(ld);
            ld = ld.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newListNode = new ListNode(0);
        ListNode p1 = l1, p2 = l2, temp = newListNode;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                temp.next = p1;
                p1 = p1.next;
            } else {
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        temp.next = p1 == null ? p2 : p1;
        return newListNode.next;
    }
}
