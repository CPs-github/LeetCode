package jianzhiOffer.simple;

public class Ep58II {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("123456",3));
    }
    public static String reverseLeftWords(String s, int n) {
        if (s.length() < 1 || s.length()<n||n <= 0){
            return s;
        }
        String str = s.substring(0,n);

        return str = s.substring(n,s.length())+str;
    }
}
