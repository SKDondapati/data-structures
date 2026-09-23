import java.util.*;

public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        int x[] = new int[n];
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            x[i] = i + 2;
        }

        for (int i = 2; i < n; i++) {
            if (x[i-2] == i) {
                primes.add(i);
                for (int j = 2 * i; j < n; j+=2) {
                    x[j] = 0;
                }
            }
        }

        System.out.println(primes);
    }
}
