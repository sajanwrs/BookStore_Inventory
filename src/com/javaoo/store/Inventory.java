/**
 * 
 */
package com.javaoo.store;

/**
 * @author waris
 *
 */
public class Inventory {
	public static void produceReport(Item[] items) {
		/*
		 * To keep track of the total number of items & the total value of them
		 */
		int totalCount = 0;
		double totalValue = 0;
		/*
		 * Formatted header
		 */
		System.out.printf("%30s%10s%5s\n", "Title", "Price", "  Quantity");
		
		for(Item item : items) {
			if(item != null) {
				System.out.printf("%30s%10s%5s\n", item.getTitle(), item.getPrice(), item.getQuantity());
				totalCount += item.getQuantity();
				totalValue += item.getPrice();
			}
		}
		System.out.printf("%-30s%10.2f%5d\n", "", totalValue, totalCount);
		
	}
}
