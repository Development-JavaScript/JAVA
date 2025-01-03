package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        ImmuableMyDate date1 = new ImmuableMyDate(2024, 1, 1);
        ImmuableMyDate date2 = date1; //x001

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        // date2 = new ImmuableMyDate(2025, 1, 1);
        // date2.withYear(2025);
        date1 = date1.withYear(2025).withMonth(12).withDay(28); // x002
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
