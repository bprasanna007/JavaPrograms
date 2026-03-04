public class frequencyCountinginArray {
    public static void main(String[] args) {
        int[]arr={2,2,5,6,4,78,92,2,2,2,2,4,5,6,7,89,};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                count++;
            }
           
        }
        System.out.println(count);
    }
}
