public class IsPrime {
    public static void main(String[] args) {
        int number = 37;
        if (isPrime(number)) {
            System.out.println("" + number + " is a prime number");
        } else {
            System.out.println("" + number + " is not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n < 4)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
