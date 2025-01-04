package ch05;

public class ArrayCopy2 {
    public static void main(String[] args) {
        String[] oldArr = {"java","array","spring"};
        String[] newArr = new String[5];

        System.arraycopy( oldArr, 0, newArr, 0, oldArr.length);

        for (int x = 0; x < newArr.length; x++){
            System.out.print(newArr[x] + ", ");
        }
    }
}
