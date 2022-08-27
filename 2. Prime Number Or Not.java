2. CHECK IF NUMBER GIVEN IS PRIME OR NOT.
  
Use if statements to check for each condition separately:
If the number is 0 or 1, it cannot be prime.
If the number is 2, it is prime number.
If the number is indivisible by other numbers in range [2 to number/2] , it is prime.
  
public static boolean isPrime(int n) {

    if (n == 0 || n == 1) {

        return false;

    }

    if (n == 2) {

        return true;

    }

    for (int i = 2; i <= n / 2; i++) {

        if (n % i == 0) {

            return false;

        }

    }

    return true;

}
