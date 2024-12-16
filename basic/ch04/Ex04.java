package ch04;

public class Ex04 {
    public static void main(String[] args) {

        for(int x = 1; x <= 5; x++){
           for(int y = 1; y <= x; y++){
               System.out.print("*");
               if(x == y){
                   System.out.println("");
               }
           }
        }
    }
}
