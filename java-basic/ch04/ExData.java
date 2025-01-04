package ch04;

public class ExData {

    static int bank;

    public static void inAmount(int amount){
        bank += amount;
    }

    public static void outAmount(int amount){
        bank -= amount;
    }

    public static void setBank(){
        System.out.println("잔고>" + bank);
    }
}
