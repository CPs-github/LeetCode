package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

public class Ep22 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(9);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(getKthFromEnd(head ,2));
    }
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node = head;
        int i = 0 , length = 0;
        while ( node != null ){
            node = node.next;
            length++;
        }
        System.out.println(length);
        node = head;
        while (i < length-k){
            node = node.next;
            i++;
        }

        return node;
    }
}
