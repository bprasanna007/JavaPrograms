public class SecondlargestelementinArray{
    public static void main(String[] args) {

        int[] arr = {10, 2, 50, 80, 900};

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}