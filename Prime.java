public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 2; i <= 100; i++) {
            if (isItPrime(i)) {
                // System.out.print(i + " ");
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isItPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
