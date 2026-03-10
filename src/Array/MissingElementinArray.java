public class MissingElementinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5};
        int sum = 0;
        int sum1;
        int N = 5;
        sum1 = N * (N + 1) / 2;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        System.out.println(sum1-sum);
    }
}
