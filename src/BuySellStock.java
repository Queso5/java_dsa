import java.util.*;
public class BuySellStock {
    public static int buySellStockBrute(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    profit = Math.max(profit, prices[j] - prices[i]);
                }
            }
        }
        return profit;
    }

    public static int buySellStockOptimal(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = buySellStockOptimal(arr);
        System.out.println(result);

    }
}
