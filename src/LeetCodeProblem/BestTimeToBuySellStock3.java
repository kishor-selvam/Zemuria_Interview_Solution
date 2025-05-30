package LeetCodeProblem;

public class BestTimeToBuySellStock3 {
    public static void main(String[] args) {
//        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] arr) {
        int n = arr.length;
        int fCost = arr[0];
        int sCost = arr[0];

        int firstProfit = 0;
        int secondProfit = 0;

        for (int i = 0; i < n; i++) {
            int price = arr[i];
            fCost = Math.min(fCost, price);
            firstProfit = Math.max(firstProfit, price - fCost);

            sCost = Math.min(sCost, price - firstProfit);
            secondProfit = Math.max(secondProfit, price - sCost);
        }

        return secondProfit;
    }
}
