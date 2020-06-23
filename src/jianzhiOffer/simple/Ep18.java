package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

public class Ep18 {
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

        System.out.println(deleteNode(head,1));
    }
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
       // System.out.println(node);
        if (head.val == val){
            head = head.next;
        }
        while ( node.next != null ){
            if (node.next.val == val){
                break;
            }
            node = node.next;
        }
        node.next = node.next.next;

        return head;
    }
}
