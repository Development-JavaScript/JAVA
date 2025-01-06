package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumders;
    private int count;

    public int[] generate(){
        lottoNumders = new int[6];
        count = 0;

        while (count < 6){
            // 1 부터 45 사이의 숫자를 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않은 경우에만 배열에 추가
            if(isUnique(number)){
                lottoNumders[count] = number;
                count++;
            }
        }
        return lottoNumders;
    }
    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number){
        for (int i = 0; i < count; i++){
            if(lottoNumders[i] == number){
                return false;
            }
        }
        return true;
    }
}
