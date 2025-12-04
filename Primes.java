public class Primes {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Error: Please enter a positive integer as an argument.");
            return;
        }

        int n = 0;

        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Argument must be a valid integer.");
            return;
        }

        if (n < 2) {
            System.out.println("Error: Please enter an integer >= 2.");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        int p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }

        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;
        for (int k = 2; k <= n; k++) {
            if (isPrime[k]) {
                System.out.println(k);
                count++;
            }
        }

        int totalNumbers = n - 1;
        int percentage = (count * 100) / totalNumbers;

        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + percentage + "% are primes)");
    }
}
