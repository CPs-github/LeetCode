package sample.day3;

/**
 *      * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 *      * 前五项如下：
 *      * 1.     1
 *      * 2.     11
 *      * 3.     21
 *      * 4.     1211
 *      * 5.     111221
 */
public class CountAndSay {
    public static void main(String[] args) {

        System.out.println(countAndSay2(4));
    }

    /**
     * 采用递归思想实现外观数列。
     * @param n
     * @return
     */
    public static String countAndSay(int n){

        // 将输出的字符串存入 StringBuilder 中。
        StringBuilder s = new StringBuilder();
        // 如果只有一行，则返回 "1"；
        if (n == 1){
            return "1";
        }


        /**
         * 通过递归描述上一行字符串的信息
         */
        String str = countAndSay(n-1 );
        /**
         *  定义字符串的双索引 index , cur；判断重复的字符串。
         *  定义字符串相邻重复的字符个数 count；
         *
         */

        int index = 0;
        int cur = 1;
        for (cur = 1 ; cur < str.length() ; cur++){
            if (str.charAt(index) != str.charAt(cur)) {
                int count = cur - index;
                s.append(count).append(str.charAt(index));
                index = cur;
            }
        }
        if (cur != index){
            int count = cur - index;
            s.append(count).append(str.charAt(index));
        }
        return s.toString();
    }

    /**
     * 采用循环的方式实现外观数列
     * @param n
     * @return
     */
    public static String countAndSay2(int n){
        if(n==1){
            return "1";
        }


        String str = "1";
        /**
         *  定义字符串的双索引 index , cur；判断重复的字符串。
         *  定义字符串相邻重复的字符个数 count；
         *  定义层次计数器 fc；
         *
         */
        int fc = 1;
        while (fc < n ){
            StringBuilder s = new StringBuilder();
            int index = 0;
            int cur = 1;
            while (cur < str.length() ){
                if (str.charAt(index) != str.charAt(cur)) {
                    int count = cur - index;
                    s.append(count).append(str.charAt(index));
                    index = cur;
                }
                ++cur;
            }
            if (cur != index){
                int count = cur - index;
                s.append(count).append(str.charAt(index));
            }
            str = s.toString();
            ++fc;
        }
        return str;
    }

}
