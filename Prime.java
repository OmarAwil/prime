import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        long number = scanner.nextLong();  // Corrected to scanner.nextLong()
        scanner.close();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(long num)
    {
        if (num <= 1){
            return false;
        }
        if (num == 2 || num ==3 ){
            return true;
        }
        if ( num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for (long i = 5; i * i <= num; i += 6 ) {
            if (num % i == 0 || num % ( i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}