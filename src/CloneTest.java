import java.lang.reflect.Method;

public class CloneTest implements Cloneable{

    public static void main(String[] args) {

        char[] str = new char[50];
        String string = "Welcome to china";
        int usedLength = 0;
        for (usedLength = 0 ; usedLength < string.length();usedLength++){
            str[usedLength] = string.charAt(usedLength);
        }
        int length = replaceBlank(str,usedLength);
        if (length > -1){
            System.out.println(new String(str,0,length));
        }else {
            System.out.println("error");
        }
    }



    public static int replaceBlank(char[] str , int usedLength){

        if (str.length == 0 || str.length<usedLength){
            return -1;
        }

        int whiteCount = 0;
        for (int i = 0 ; i < usedLength ; i++){
            if (str[i] == ' '){
                whiteCount++;
            }
        }

        int targetLength = usedLength + 2*whiteCount;
        System.out.println(usedLength+","+targetLength);
        int tmp = targetLength;

        if (targetLength>str.length){
            return -1;
        }
        if (whiteCount == 0){
            return usedLength;
        }
        usedLength--;
        targetLength--;
        while (usedLength>=0 && usedLength<targetLength){
            if (str[usedLength] == ' '){
                str[targetLength--] = '0';
                str[targetLength--] = '2';
                str[targetLength--] = '%';
            }else {
                str[targetLength]= str[usedLength];
                targetLength--;
            }

            usedLength--;
        }

        return tmp;
    }

}

