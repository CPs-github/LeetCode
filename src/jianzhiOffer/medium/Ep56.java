package jianzhiOffer.medium;

import java.util.HashMap;

public class Ep56 {
    public static void main(String[] args) {

    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums ){
            if (hashMap.containsKey(num)){
                hashMap.put(num,hashMap.get(num)+1);
            }else {
                hashMap.put(num,1);
            }
        }
        for (int key : hashMap.keySet()){
            if (hashMap.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}
