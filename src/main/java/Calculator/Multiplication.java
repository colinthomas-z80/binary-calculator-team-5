package Calculator;


public class Multiplication {
    static long calc(long b1, long b2) {
        int i = 0;
        long rmdir = 0;
        long result = 0;
        long[] sum = new long[20];
        while (b1 != 0 || b2 != 0) {                  //actual multiplying
            sum[i++] = (b1 % 10 + b2 % 10 + rmdir) % 2;
            rmdir = (b1 % 10 + b2 % 10 + rmdir) / 2;
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (rmdir != 0) {
            sum[i++] = rmdir;
        }--i;
        while (i >= 0) {                              //forming the result
            result = result * 10 + sum[i--];
        }
        return result;
    }

}
