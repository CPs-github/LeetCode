package sample.day1;

/**
 * 2�����⣺������ת��
 */
public class Reverse {
    public static void main(String[] args) {
        int i = 108;
        System.out.println(reverse(32768));
    }

    public static int reverse(int x){
        long t = x;
        long i = 0;
        while (t!=0){
            i = i*10 + (t%10);
            t = t/10;
        }
        System.out.println(i +"   "+Integer.MIN_VALUE +  "  "+Integer.MAX_VALUE );
        if(i < Integer.MIN_VALUE || i > Integer.MAX_VALUE)
        {
            System.out.println("�쳣");
            return 0;
        }
        return (int)i;
    }
}
