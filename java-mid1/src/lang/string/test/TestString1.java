package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://wwww.dongin97.tistory.com";
        boolean result = url.startsWith("https://");
        System.out.println("확인: " + result);
    }
}
