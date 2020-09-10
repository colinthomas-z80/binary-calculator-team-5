package java;


public class operations {
    public static String Bdivide(String quotient, String dividend) {
        int q = Integer.parseInt(quotient, 2);
        int d = Integer.parseInt(dividend, 2);
        return Integer.toString(q/d, 2);
    }
    public static String Bsubtract(String minuend, String subtrahend) {
        int m = Integer.parseInt(minuend, 2);
        int s = Integer.parseInt(subtrahend, 2);
        return Integer.toString(m-s, 2);
    }
    public static String Bsquare(String number) {
        int num = Integer.parseInt(number, 2);
        return Integer.toString((int) Math.pow(num,2), 2);
    }
    public static String Broot(String number) {
        int num = Integer.parseInt(number, 2);
        return Integer.toString((int) Math.sqrt(num), 2);
    }
}
