package sample;

import java.util.Arrays;

public class Ep455AssignCookies {
    public static void main(String[] args) {

    }

    /**
     *
     * @param g 期望值
     * @param s 实际值
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int si = s.length-1 , gi = g.length-1;
        int ret = 0;

        while (gi >=0 && si >= 0){
            if (s[si] >= g[gi]){
                ret ++;
                si--;
                gi--;
            }else {
                gi--;
            }
        }
        return ret;
    }
}
