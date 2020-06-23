package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

public class Ep24 {
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
        // System.out.println(head);
        System.out.println(getSingleLinkedList(head));
        System.out.println(getSingleLinkedList(reverseList(head)));
        System.out.println(getSingleLinkedList(head));
        System.out.println(getSingleLinkedList(reverseList2(head)));

    }

    public static ListNode reverseList(ListNode head) {
        ListNode n2 = new ListNode(-1);
        n2.next = head;
        ListNode reversetHead = new ListNode(-1);
        ListNode temp = n2.next;
        ListNode next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = reversetHead.next;
            reversetHead.next = temp;
            temp = next;
        }
        n2.next = reversetHead.next;
        return n2.next;
    }

    public static ListNode reverseList2(ListNode head) {

        ListNode tempNode = head;
        ListNode nextNode = null;
        ListNode pre = null;
        int i = 0;
        while (tempNode != null){
            i++;
            nextNode = tempNode.next;
            tempNode.next = pre;
            pre = tempNode;
            tempNode = nextNode;
        }
        System.out.println(i);
        return pre;
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
