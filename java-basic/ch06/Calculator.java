package ch06;

public class Calculator {

    public void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    public static int plues(int x, int y){
        int result = x + y;
        return result;
    }
    public static int divide(int x, int y){
        int h = x / y;
        return h;
    }
}
