package sample.day2;


public class AddTowNumbers {

    public static void main(String[] args) {

    }

    public static ListNode addTowNumbers(ListNode l1, ListNode l2){
        int j = 0;// ��λ
        ListNode sumNode = new ListNode(0);//  ���ڴ�ź�
        ListNode p1 = l1,p2 = l2, cNode = sumNode;
        while (p1 != null || p2 != null){
            int x = (p1 == null) ? 0:p1.val;
            int y = (p2 == null) ? 0:p2.val;
            int sum = j + x +y;
            cNode.next = new ListNode(sum % 10);
            j = sum/10;
            // ��λ
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
            cNode = cNode.next;
        }
        if (j>0) cNode.next = new ListNode(j);
        return sumNode.next;
    }
}
