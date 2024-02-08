public class PrimeNumber {
    public static void main(String[] args) {
        int num = 100000;
        boolean isPrime = true;
        for (int i = 234; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false ;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(" is not a prime number .");
        }
    }

}
