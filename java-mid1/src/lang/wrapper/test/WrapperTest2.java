package lang.wrapper.test;

import java.util.Arrays;

public class WrapperTest2 {
    public static void main(String[] args) {
       String[] array = {"1.5", "2.5", "3.0"};
       double sum = 0;

        for (String string : array) {
            double v = Double.parseDouble(string);
            sum += v;
        }
        System.out.println("sum = " + sum);
    }
}
