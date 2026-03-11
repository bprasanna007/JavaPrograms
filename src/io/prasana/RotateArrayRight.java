public class RotateArrayRight {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int last = arr[arr.length - 1];  // store last element

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];         // shift elements to the right
        }

        arr[0] = last;                  // put last element at first position

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}