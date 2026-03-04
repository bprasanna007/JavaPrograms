public class LargerinArray {
    public static void main(String[] args) {
        int[]arr={10,2,50,80,900};
        int max;
        max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);


    }
}
