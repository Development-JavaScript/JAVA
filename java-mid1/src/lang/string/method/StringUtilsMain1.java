package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object object = new Object();
        String str = "Hello, Java";
        
        //ValueOf 매서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);
        String objectString = String.valueOf(object);
        System.out.println("객체의 문자열 값: " + objectString);

        //문자 + x = 문자
        String numString2 = "" + num; // 100
        System.out.println("빈문자열 + num: " + numString2);

        //toCharArray메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
    }
}
