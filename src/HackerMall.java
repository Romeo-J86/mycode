/**
 * @author romeo.jerenyama
 * @created 19/02/2024 - 18:53
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerMall {

    public static long findMinimumPrice(List<Integer> price, int m) {
        long totalAmount = 0;

        // Sort the prices in ascending order to utilize coupons effectively
        price.sort(null);

        // Iterate through each item and apply the coupons optimally
        for (int i = 0; i < price.size(); i++) {
            // Calculate the maximum number of coupons that can be applied to the current item
            int maxCoupons = Math.min(m, i);
            // Calculate the discounted price using the maximum coupons
            long discountedPrice = price.get(i) / (long) Math.pow(2, maxCoupons);
            // Add the discounted price to the total amount
            totalAmount += discountedPrice;
        }

        return totalAmount;
    }
    public static long findMinimumPrice1(List<Integer> price, int m) {
        // Sort the prices in descending order to use the highest discounts first
        Collections.sort(price, Collections.reverseOrder());

        long totalAmount = 0;

        for (int i = 0; i < price.size() - 1; i++) {
            // Calculate the discounted price using at most m coupons
            long discountedPrice = price.get(i) / (long) Math.pow(2, Math.min(m, i));
            // Add the discounted price to the total amount
            totalAmount += discountedPrice;
        }

        // Use the coupon on the last item
        totalAmount += price.get(price.size() - 1) / (long) Math.pow(2, Math.min(m, price.size() - 1));

        return totalAmount;
    }


    public static void main(String[] args) {
        // Example usage
        List<Integer> price = new ArrayList<>();
        price.add(1);
        price.add(2);
        price.add(3);
        int m = 1;
        long minimumAmount = findMinimumPrice1(price, m);
        System.out.println("Minimum amount needed: " + minimumAmount);
    }
}
