package jianzhiOffer.simple;

public class Ep11 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,-1,0};
        System.out.println(minArray(numbers));
    }
    public static int minArray(int[] numbers) {

        int i = 0 , j = numbers.length-1;

        while (i < j){
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]){
                i = m + 1;
            }else if (numbers[m] < numbers[j]){
                j = m;
            }else {
                j--;
            }
        }

        return numbers[i];
    }
}
