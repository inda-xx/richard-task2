A suggested solution for this task can be implemented as follows:

```Java
public class Main {

    public static void main(String[] args) {
        System.out.println(countPrimeNumbers(1));
        System.out.println(countPrimeNumbers(2));
        System.out.println(countPrimeNumbers(10));
        System.out.println(countPrimeNumbers(30));
    }

    public static int countPrimeNumbers(int n) {
        int count = 0;
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
```
In the above code, `countPrimeNumbers` function counts the prime numbers less than or equal to the given number `n`. The helper function `isPrime` checks whether a number is prime or not.