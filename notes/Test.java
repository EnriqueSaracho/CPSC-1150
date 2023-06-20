public class Test {
    public static void main(String[] args) {
        int num = 2;
        boolean result;
        while (num < 1000) {
            result = isPrime(num);
            if (result)
                printPrime(num);
            num++;
        }
    }

    public static boolean isPrime(int num) {
        int divisor = 2;
        if (divisor <= num / 2) {
            if (num % divisor == 0)
                return false;
            divisor++;
        }
        return true;
    }

    public static void printPrime(int num) {
        System.out.println(num);
    }
}
