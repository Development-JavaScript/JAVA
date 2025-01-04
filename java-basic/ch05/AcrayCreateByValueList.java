package ch05;

public class AcrayCreateByValueList {
    public static void main(String[] args) {
        int[] scores = new int[]{83, 90, 87};
        int sum = 0;

        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }

        System.out.println(sum);
        printItem(scores);
    }

    private static void printItem(int[] scores){
        for(int i = 0; i < scores.length; i++){
            System.out.println("score[" + i + "]: " + scores[i] );
        }
    }
}
