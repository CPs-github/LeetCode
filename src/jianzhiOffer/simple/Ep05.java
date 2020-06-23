package jianzhiOffer.simple;

public class Ep05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace2("hello world !"));
    }
    public static String replaceSpace(String s){
        int length = s.length();
        char[] arrays = new char[length*3];
        int size = 0;
        for (int i = 0 ; i < s.length() ; i ++ ){
            if (s.charAt(i) == ' '){
                arrays[size++] = '%';
                arrays[size++] = '2';
                arrays[size++] = '0';
            }else {
                arrays[size++] = s.charAt(i);
            }
        }
        String str = new String(arrays,0,size);
        return str;
    }
    public static String replaceSpace2(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        s = stringBuilder.toString();
        return s;
    }
}
