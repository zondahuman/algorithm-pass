package com.abin.lee.algorithm.pass.leetcode.greedy;

import com.abin.lee.algorithm.pass.common.JsonUtil;

/**
 * Created by abin on 2017/12/10 2017/12/10.
 * algorithm-pass
 * com.abin.lee.algorithm.pass.leetcode.greedy
 * [LeetCode] Best Time to Buy and Sell Stock II 买股票的最佳时间之二
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BuySellStockII {

    public static void main(String[] args) {
        int[] input = new int[]{2, 7, 11, 15};
        int result = maxProfit(input);
        System.out.println("result="+ JsonUtil.toJson(result));
        int result1 = maxProfit1(input);
        System.out.println("result1="+ JsonUtil.toJson(result1));
    }

    /**
     * 但都比较容易解答。这道题由于可以无限次买入和卖出。我们都知道炒股想挣钱当然是低价买入高价抛出，
     * 那么这里我们只需要从第二天开始，如果当前价格比之前价格高，则把差值加入利润中，因为我们可以昨天买入，
     * 今日卖出，若明日价更高的话，还可以今日买入，明日再抛出。以此类推，遍历完整个数组后即可求得最大利润。代码如下：
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1])
                sum += prices[i+1] - prices[i];
        }
        return sum;
    }
    public static int maxProfit1(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i-1] < prices[i])
                sum += prices[i] - prices[i-1];
        }
        return sum;
    }



}
