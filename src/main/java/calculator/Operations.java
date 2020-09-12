package calculator;


public class Operations {
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
    public static String Bmultiply(String num1, String num2) {
        int n1 = Integer.parseInt(num1, 2);
        int n2 = Integer.parseInt(num2, 2);
        return Integer.toString(n1*n2, 2);
    }
    public static String Badd(String num1, String num2) {
        int n1 = Integer.parseInt(num1, 2);
        int n2 = Integer.parseInt(num2, 2);
        return Integer.toString(n1+n2, 2);
    }
    public static String Convert(String number, Boolean isBinary) {
        if(isBinary) {
            int n1 = Integer.parseInt(number,2);
            return Integer.toString(n1,10);
        }
        else {
            int n1 = Integer.parseInt(number, 10);
            return Integer.toString(n1,2);
        }
    }
}
