package ch04;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++){
            System.out.println("***** " + x + "단 *****");
            for (int y = 1; y <= 9; y++){
                System.out.println( x + "x" + y + "= " + x*y );
            }
        }
    }
}
