package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
       // Integer -> int
        int intValue = integer1;
        //int -> Interger
        Integer integer2 = intValue;


        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);

    }
}
