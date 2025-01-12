package lang.wrapper.test;

public class LottoGeneratorMain1 {
    public static void main(String[] args) {
        LottoGenerator1 lotto = new LottoGenerator1();
        int[] lottoNumbers = lotto.generate();

        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
