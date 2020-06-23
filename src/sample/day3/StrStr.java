package sample.day3;

/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1。
 *
 */
public class StrStr {
    public static void main(String[] args) {

        String haystack = "hewqwl2lol2lo";
        String needle = "l2lo";
        System.out.println(strStr(haystack,needle));
    }
//    public static int strStr(String haystack, String needle) {
//
//      int hlength = haystack.length();
//      int nlength = needle.length();
//
//      int i = 0;
//      while (i < hlength - nlength + 1){
//
//          if (haystack.substring(i,i+nlength).equals(needle)) {
//              return i;
//          }
//          i++;
//      }
//      return -1;
//    }
    public static int strStr(String haystack, String needle){

        int hl = haystack.length() , nl = needle.length();
        if (nl == 0) return 0;
        int pn = 0;
        while (pn < hl - nl +1){
            while (pn < hl - nl + 1 && haystack.charAt(pn) != needle.charAt(0)) ++pn;
            int t = 0 , pl = 0;
            while (pl < nl && pn < hl && haystack.charAt(pn) == needle.charAt(pl)){
                ++pl;
                ++pn;
                ++t;

            }
            if (t == nl){
                return pn-nl;
            }
            pn = pn - t + 1;
        }
        return -1;
    }
}
