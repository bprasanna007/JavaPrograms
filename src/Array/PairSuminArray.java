public class PairSuminArray {
    public static void main(String[] args) {

        int[] arr = {12,7,9,11};
        int target = 9;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                if(arr[i] + arr[j] ==target){
                    System.out.println("Pair: " + arr[i] + " , " + arr[j]);
                }

            }
        }
    }
}