package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(11);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode head2 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l22 = new ListNode(3);
        ListNode l33 = new ListNode(4);
        ListNode l44 = new ListNode(10);
        head2.next = l11;
        l11.next = l22;
        l22.next = l33;
        l33.next = l44;

        Ep25 ep25 = new Ep25();

        System.out.println(getSingleLinkedList(ep25.mergeTwoLists(head, head2)));
    }
    public static String getSingleLinkedList(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        ;
        //  判断链表是否为空
        if (head == null) {
            return "链表为空";
        }
        //  因为头结点不能移动，因此需要一个辅助变量来遍历链表
        ListNode temp = head;
        stringBuilder.append("[ ");
        while (true) {
            //  判断是否到最后
            if (temp == null) {
                break;
            }
            stringBuilder.append(temp.val + "->");
            //  将temp后移
            temp = temp.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
