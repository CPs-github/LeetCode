package sample.day3;

public class AddBinary {
    public static void main(String[] args) {

        String a = "10101";
        String b = "1001";
        System.out.println(new AddBinary().addBinary(a,b));

    }
    public String addBinary(String a, String b) {

        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }


}

