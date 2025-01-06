package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토박싱(Auto-boxing)
        //Wrapper -> Primitve
        int unboxedValue = boxedValue; // 오토 언박식(Auto-Unboxing)
        
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
