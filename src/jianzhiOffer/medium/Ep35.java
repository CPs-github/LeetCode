package jianzhiOffer.medium;
import jianzhiOffer.module.Node;
public class Ep35 {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        if (head == null ){
            return null;
        }
        cpoyNode(head);
        randomNodeLink(head);
        return  reSet(head);
    }

    public void cpoyNode(Node head){
        while (head != null){
            Node copyNode = new Node(head.val);
            copyNode.next = head.next;
            head.next = copyNode;
            head = copyNode.next;
        }
    }
    public void randomNodeLink(Node head){
        while (head!=null){
            Node copyNode = head.next;
            if (head.random != null){
                Node randomNode = head.random;
                copyNode.random = randomNode.next;
            }
            head = copyNode.next;
        }
    }
    public Node reSet(Node head){
        Node copyNode = head.next;
        Node copyHead = copyNode;
        head.next = copyNode.next;
        head = head.next;
        while (head != null){
            copyNode.next = head.next;
            head.next = head.next.next;
            head = head.next;
            copyNode = copyNode.next;
        }

        return copyHead;
    }

}
