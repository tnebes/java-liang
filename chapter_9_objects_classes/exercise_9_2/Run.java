/*
 * Design a class named Stock that contains:
 * 	A string data field named symbol for the stock's symbol
 * 	A string data field named name for the stock's name
 * 	A double data field named previousClosingPrice that stores the stock price for the previous day
 * 	A double data field named currentPrice that stores the stock price for the current time
 * 	A constructor that creates a stock with the sybmol and name
 * 	A method named getChangePercent that retuns the percentage changed
 * 		from previousClosingPrice to currentPrice
 * 
 * 	Write a test program
 * 	that creates a Stock object with the stock symbol ORCL, the name Oracle
 * 	Corporation, and the previous closing price of 34.5. Set a new current price to
 * 	34.35 and display the price-change percentage.
 */

public class Run {

	public static void main(String[] args) {
		Stock oracle = new Stock("ORCL", "Oracle");
		oracle.setPreviousClosingPrice(34.5);
		oracle.setCurrentPrice(34.55);
		System.out.printf("Price change of %s is %.3f%%\n", oracle.getName(), oracle.getPercentChange());
	}

}
