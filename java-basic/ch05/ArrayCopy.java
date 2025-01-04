package ch05;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] oldArr = {1, 2, 3};
        int[] newArr = new int[5];

        for(int i = 0; i < oldArr.length; i++){
             newArr[i] = oldArr[i];
        }
        for(int x = 0; x < newArr.length; x++){
            System.out.print(newArr[x] + ",");
        }
    }
}
