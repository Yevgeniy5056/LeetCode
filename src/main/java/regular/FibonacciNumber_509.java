package regular;

public class FibonacciNumber_509 {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(f(n));
    }

    private static int f(int n) {

        int res = 0;
        int num2 = 1;
        int num1 = 0;
        for (int i = 2; i <= n; i++) {
            res = num2 + num1;
            num1 = num2;
            num2 = res;
        }
        return res;
    }
}
