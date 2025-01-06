package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int i = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        int result = i + i2;
        System.out.println("result = " + result);
    }
}
