package ch04;

public class BreakOutter {
    public static void main(String[] args) throws Exception{
        Outter: for(char upper = 'A'; upper <= 'Z'; upper++){
            for (char lower = 'a'; lower <= 'z'; lower++){
                System.out.println(upper + "-" + lower);

                if(lower == 'g'){
                    System.out.println("종료");
                    break Outter;
                }
            }
        }
    }
}
