package ch05;

public class Ex2 {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int num = 0;
        int sum = 0;

        for(int x = 0; x < arr.length; x++){
            num += arr[x].length;
            for (int y = 0; y < arr[x].length; y++){
                sum += arr[x][y];
            }
        }
        double aver = (double) sum / num;
        System.out.println(aver);
    }
}
