package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

public class Ep52 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headA1 = new ListNode(1);
        ListNode headA2 = new ListNode(8);
        ListNode headA3 = new ListNode(4);
        ListNode headA4 = new ListNode(5);
        headA.next = headA1;
        headA1.next = headA2;
        headA2.next = headA3;
        headA3.next = headA4;

        ListNode headB = new ListNode(5);
        ListNode headB1 = new ListNode(0);
        ListNode headB2 = new ListNode(1);


        headB.next = headB1;
        headB1.next = headB2;
        headB2.next = headA2;

        System.out.println(getIntersectionNode(headA,headB).val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode tempA , tempB;
        tempA = headA;
        tempB = headB;
        int count = 0;
        while(tempA != tempB){
            System.out.println(tempA.val +","+tempB.val);
            tempA = tempA.next;
            tempB = tempB.next;
            if (tempA == null){
                tempA = headB;
                count++;
            }
            if ( tempB == null){
                tempB = headA;
                count++;
            }
            if (count>2){
                return null;
            }
        }
        return  tempA;
    }
}
