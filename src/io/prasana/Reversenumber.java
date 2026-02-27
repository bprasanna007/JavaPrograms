public class Reversenumber {
    public static void main(String[] args) {
        int n=123;
        int num;
        int reverse=0;
        while(n!=0){
            num=n%10;
            n=n/10;

            reverse=reverse*10+num;

        }
        System.out.println(reverse);
    }
}
