public class Linearsearch {

            public static void main(String[] args) {

                int[] arr = {5,8,12,20,7};
                int target = 7;

                for(int i=0;i<arr.length;i++){
                    if(arr[i]==target){
                        System.out.println("Element found at index: "+i);
                    }
                }
            }
        }
    