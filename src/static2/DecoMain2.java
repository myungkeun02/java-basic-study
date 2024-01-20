package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello Java";
        String deco = DecoUtil2.deco(s);
        System.out.println("Before: "+ s);
        System.out.println("After: "+ deco);
    }
}
