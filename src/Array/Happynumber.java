import java.util.HashSet;

public class Happynumber {

    public static void main(String[] args) {
        int n = 19;   // Change this value to test
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;  // cycle detected
            }

            seen.add(n);
            n = getNext(n);
        }

        return true;
    }

    private static int getNext(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}