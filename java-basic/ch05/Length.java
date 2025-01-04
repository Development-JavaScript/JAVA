package ch05;

public class Length {
    public static void main(String[] args) {

        String ssn = "9712281999999";
        int length = ssn.length();

        if(length == 13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.(13자리)");
        }
    }
}
