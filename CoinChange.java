import java.util.Scanner;

public class CoinChange {

    // Fungsi untuk menghitung jumlah cara untuk mencapai jumlah tertentu
    public static int countWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // Ada satu cara untuk mendapatkan jumlah 0

        // Iterasi untuk setiap koin
        for (int coin : coins) {
            for (int x = coin; x <= amount; x++) {
                dp[x] += dp[x - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        // Daftar koin yang tersedia
        int[] coins = {2, 3, 5, 10, 15};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang ingin ditukarkan: ");
        int amount = scanner.nextInt();

        // Hitung jumlah cara
        int ways = countWays(coins, amount);

        System.out.println("Jumlah cara untuk mendapatkan " + amount + " dengan koin " + java.util.Arrays.toString(coins) + " adalah: " + ways);
        scanner.close();
    }
}