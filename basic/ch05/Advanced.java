package ch05;

public class Advanced {
    public static void main(String[] args) {
        int[] socres = {80, 60, 70};
        int sum = 0;

        for(int socre : socres){
            sum += socre;
        }
        System.out.println("총점: " + sum);
        double average = (double) sum / socres.length;
        System.out.println("평균: " + average);
    }
}
