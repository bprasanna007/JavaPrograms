public class SmallestinArray {
    public static void main(String[] args) {
        int[]arr={10,2,50,80,900};
        int min;
        min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(min);
    }
}
