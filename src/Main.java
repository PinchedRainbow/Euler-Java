// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Problem1.main(args);
        Problem2.main(args);
        Problem3.main(args);
        Problem4.main(args);
        Problem5.main(args);
        Problem6.main(args);
    }
}

// If we list all natural numbers below 10 that are multiples of 3, 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                sum+=i;
            }
        }
        System.out.println("Problem 1: " + sum);
    }
}

// Each new term in the Fibonacci sequence is generated by adding the previous two terms
// By considering the terms in the Fibonacci sequence whose values do not exceed 4 million, find the sum of even valued!

class Problem2 {
    public static void main(String[] args) {
        int sum = 0;
        int limit = 4000000;
        int n = 0;
        int fib = Fibonacci(n);

        while (fib <= limit)
        {
            if (fib % 2 == 0)
            {
                sum += fib;
            }
            n++;
            fib = Fibonacci(n);
        }

        System.out.println("Problem 2: " + sum);
    }
    
    private static int Fibonacci (int n)
    {
        if (n == 0 || n == 1) return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}


class Problem3 {
    public static void main(String[] args) {
        long primeNumber = 600851475143L;
        largestPrimeNumber(primeNumber);

    }

    private static void largestPrimeNumber(long number)
    {
        int i;
        int largestPrime = 0;
        for (i = 2; i <= number; i++)
        {
            if (number % i == 0)
            {
                largestPrime = i;
                number /= i;
                i--;
            }
        }
        System.out.println("Problem 3: " + largestPrime);
    }
}


class Problem4 {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int i = 0; i < 1000; i++)
        {
            for (int j = 0; j < 1000; j++)
            {
                if (isPalindrome(i*j) && i*j > largestPalindrome)
                {
                    largestPalindrome = i*j;
                }
            }
        }

        System.out.println("Problem 4: " + largestPalindrome);
    }

    public static boolean isPalindrome(int number)
    {
        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--)
        {
            char digit = digits[i];
            reverse.append(digit);
        }

        return reverse.toString().equals(String.valueOf(number));
    }
}


//class Problem5 {
//    public static void main(String[] args) {
//        int number = 1;
//        int max = 20;
//        boolean found = false;
//        while (!found)
//        {
//            boolean[] divisible = new boolean[max - 1];
//            number++;
//            for(int i = 1; i < max; i++)
//            {
//                divisible[i - 1] = number % i == 0;
//            }
//            if (isAllTrue(divisible)){ found = true; }
//        }
//        System.out.println("Problem 5: " + number);
//    }
//
//    public static boolean isAllTrue(boolean[] array) {
//        for (boolean value : array) {
//            if (!value) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//}


class Problem5 {
    public static void main(String[] args) {
        long result = findSmallestMultiple(20);
        System.out.println("Problem 5: " + result);
    }

    public static long findSmallestMultiple(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = lcm(result, i);
        }
        return result;
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }
}


class Problem6 {
    public static void main(String[] args) {
        int number = 100;
        int sum = 0;
        int square = 0;

        for (int i = 0; i < number + 1; i++)
        {
            sum+=i;
            square+= (int) Math.pow(i, 2);
        }
        sum = (int) Math.pow(sum, 2);
        System.out.println("Problem 6: " + String.valueOf(sum-square));
    }
}


class Problem7 {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }
        }

    }
}