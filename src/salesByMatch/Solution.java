import java.io.*;
import java.util.*;

public class Solution {
    // LMFAO RNG YEAH WHY NOT
    static int rng(int min, int max) {
        return ((int) (Math.random() * (max - min))) + min;
    }
    
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        int min = -100000, max = 100000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (ar[i] == ar[j]) {
                    ar[i] = rng(min, max);
                    ar[j] = rng(min, max);
                    count++;
                }
            }
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
