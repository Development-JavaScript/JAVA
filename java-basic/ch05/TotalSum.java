package ch05;

public class TotalSum {
    public static void main(String[] args) {
        int[][] score = {{80,90,96}, {76,88}};
        int totalM = 0;
        int sum = 0;

        for(int i = 0; i < score.length; i++){
            totalM += score[i].length;
            for(int y = 0; y < score[i].length; y++){
                sum += score[i][y];
            }
        }
        System.out.println(totalM);
        double average = (double) sum / totalM;
        System.out.println(average);

    }
}