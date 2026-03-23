public class Dice {

    static int dice(int n) {
        int ans;

        if (n == 1) {
            ans = 6;
        } else if (n == 2) {
            ans = 5;
        } else if (n == 3) {
            ans = 4;
        } else {
            ans = 6;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(dice(n)); 
    }
}