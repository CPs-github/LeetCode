package interview;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Shuffle().shuffle( new int[]{1,2,3,4,5,6,7} ,2) ));
    }

    public int[] shuffle(int[] pokers,int n){

        int len = pokers.length;
        int mid = (0+len-1)/2;
        int[] rets = new int[len];
        for (int i = 1 ; i <= n ; i++){
            int legtIndex = 0;
            int index = 0;
            if (i % 2 > 0){
                int rightIndex = mid+1 ;
                while (true){
                    if (index<rets.length){
                        rets[index++] = pokers[legtIndex++];
                    }
                    if (index<rets.length) {
                        rets[index++] = pokers[rightIndex++];
                    }else {
                        break;
                    }
                }
            }else {
                int rightIndex = mid+1 ;
                while (true){
                    if (index<rets.length && rightIndex < pokers.length){
                        rets[index++] = pokers[rightIndex++];
                    }
                    if (index<rets.length) {
                        rets[index++] = pokers[legtIndex++];
                    }else {
                        break;
                    }
                }
            }
            for (int j = 0 ; j < len;j++){
                pokers[j] = rets[j];
            }
        }
        return rets;
    }
}
