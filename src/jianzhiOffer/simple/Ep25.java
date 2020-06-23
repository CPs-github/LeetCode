package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

public class Ep25 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        ListNode temp1 = l1, temp2 = l2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 == null ){
            temp.next = temp2;
        }
        if (temp2 == null){
            temp.next = temp1;
        }
        return newNode.next;
    }
}
