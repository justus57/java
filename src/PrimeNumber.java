public class PrimeNumber {
    public static void main(String[] args){
System.out.println(isprime(12));
    }
    public static boolean isprime(int n){
        if(n==0||n==1){
            return false;
        }
        if (n == 2){
            return true;
        }
        for(int i = 2;i<=2;i++){
            if(n%i == 0){
                return false;
            }
        }
 return  true;
    }
}
