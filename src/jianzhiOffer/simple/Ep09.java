package jianzhiOffer.simple;

import java.util.LinkedList;

public class Ep09 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
class CQueue{

    LinkedList<Integer> stack ;

    public CQueue(){
        stack = new LinkedList<>();
    }


    public void appendTail(int value){
        stack.add(value);
    }

    public int deleteHead(){
        if (stack.isEmpty()){
            return -1;
        }
        return stack.pop();

    }
}