package ch05;

public class SubString {
    public static void main(String[] args) {
        String ssn = "12345-abcdefg";

        String firstNum = ssn.substring(0, 5);
        System.out.println(firstNum);

        String secondNum = ssn.substring(6);
        System.out.println(secondNum);
    }
}
