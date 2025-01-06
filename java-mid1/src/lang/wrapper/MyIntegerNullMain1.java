package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1),new MyInteger(2),new MyInteger(3)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }
    public static MyInteger findValue(MyInteger[] intArr, int target){
        for (MyInteger myInteger : intArr) {
            if(myInteger.getValue() == target){
                System.out.print("확인완료: ");
                return  myInteger;
            }
        }
        System.out.print("확인불가: ");
        return null;
    }
}
