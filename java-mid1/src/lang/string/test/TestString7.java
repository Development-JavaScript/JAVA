package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "  Hello Java   ";
        String trim = original.trim();
        String strip = original.strip();
        System.out.println("trim: " + trim);
        System.out.println("strip: " + strip);
    }
}
