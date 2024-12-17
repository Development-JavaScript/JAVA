package ch05;

public class Split {
    public static void main(String[] args) {
        String board = "1,자바학습,참조 타입 String을 학습합니다.,원동인";
        String[] arr = board.split(",");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
