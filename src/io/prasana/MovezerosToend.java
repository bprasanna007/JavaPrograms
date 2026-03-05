public class MovezerosToend {
    public static void main(String[] args) {

        int[] arr = {1,2,3,0,4,0,5,9,0};

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 0){

                for(int j = i + 1; j < arr.length; j++){

                    if(arr[j] != 0){

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        break;
                    }
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}