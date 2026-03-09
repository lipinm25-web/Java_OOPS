public class ReverseString {
    public static void main(String[] args) {
        String str = "Lipika";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed String: " + sb);
    }
}