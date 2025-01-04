package ch05;

public class Equals {
    public static void main(String[] args) {

        String ssn = "9712281999999";
        char sex = ssn.charAt(6);

        switch (sex){
            case '1' :
            case '3' :
                System.out.println("남성");
                break;

            case '2' :
            case '4' :
                System.out.println("여성");
                break;
        }
    }
}
