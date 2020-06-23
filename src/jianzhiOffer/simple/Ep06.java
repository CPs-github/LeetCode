package jianzhiOffer.simple;

import jianzhiOffer.module.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Ep06 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;
        System.out.println(Arrays.toString(reversePrint(head)));
    }
    public static int[] reversePrint(ListNode head) {

        ArrayList arrays = new ArrayList<Integer>();
        while (head != null){
            arrays.add(head.val);
            head = head.next;
        }
        int[] nums = new int[arrays.size()];
        for (int i = arrays.size()-1; i >= 0 ; i--){
            nums[i] = (int) arrays.get(arrays.size()-i-1);
        }
        return nums;
    }
}
