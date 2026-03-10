public class SumofeveninArray {
    public static void main(String[] args) {
        int[]arr={11,2,4,6,8,5,7,9,3,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                sum = sum + arr[i];
            }
        }
        System.out.print(sum);
    }
    }


