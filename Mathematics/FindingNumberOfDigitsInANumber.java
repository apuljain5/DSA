import java.util.Scanner;

/**
 * FindingNumberOfDigitsInANumber
 */
public class FindingNumberOfDigitsInANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findNumberOfDigits(n));
    }

    public static int findNumberOfDigits(int n) {
        return (int) (Math.floor(Math.log10(n)) + 1);
    }
}