public class twosum {
    public static void main(String[] args) {

        int[] num = {2, 5, 7, 15};
        int target = 9;

        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                if (num[i] + num[j] == target) {
                    System.out.println("Index: " + i + ", " + j);
                    return;
                }

            }
        }

        System.out.println("No pair found");
    }
}