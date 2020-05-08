package DP;

public class BestTimetoBuyandSellStock {

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minBuy = Integer.MAX_VALUE;
		for (int i : prices) {
			if (i < minBuy)
				minBuy = i;
			if ((i - minBuy) > maxProfit)
				maxProfit = i - minBuy;
		}
		return maxProfit;
	}
}
