package Arrays;

public class LeetCode__StockBuySell {
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};

        System.out.println(maxProfitOptimal(arr));
    }

    private static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for(int i = 0; i< n-1; i++){
            int profit;
            for(int j = i+1; j<n; j++){
                if(prices[j] > prices[i]){
                    profit = prices[j] - prices[i];

                    maxProfit = (profit > maxProfit) ? profit : maxProfit;
                }
            }
        }

        return maxProfit;
    }


    private static int maxProfitOptimal(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];

        for(int i = 1; i< n; i++){
            int cost = prices[i] - min;
            profit = (cost > profit) ? cost : profit;
            min = (prices[i] < min) ? prices[i] : min;
        }

        return profit;
    }
}
