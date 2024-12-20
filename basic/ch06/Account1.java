package ch06;

public class Account1 {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balace;

    public int getBalace(){
        return balace;
    }

    public void setBalace(int balace){
        if(balace < Account1.MIN_BALANCE || balace > Account1.MAX_BALANCE){
            return;
        }
        this.balace = balace;
    }
}
