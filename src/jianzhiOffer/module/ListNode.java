package jianzhiOffer.module;

public class ListNode {
    public ListNode next ;
    public int val ;
    public ListNode(int x){
        this.val = x;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(val);
        while (next != null){
            stringBuilder.append(" -> "+val);
            next = next.next;
        }
        return stringBuilder.toString();
    }
}
