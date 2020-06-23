package sample.day3;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "b a   ";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord(s));

    }

    public int lengthOfLastWord(String s) {
        int i,length = s.length()-1;
        while (length>0 && s.charAt(length) == ' '){
            length--;
        }
        for (i = 0; i <= length; ++i) {
            if (s.charAt(length - i) == ' ') {
                return i;
            }
        }
        return i;
    }

}
