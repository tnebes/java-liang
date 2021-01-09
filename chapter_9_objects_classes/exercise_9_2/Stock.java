/*
 * Design a class named Stock that contains:
 * 	A string data field named symbol for the stock's symbol
 * 	A string data field named name for the stock's name
 * 	A double data field named previousClosingPrice that stores the stock price for the previous day
 * 	A double data field named currentPrice that stores the stock price for the current time
 * 	A constructor that creates a stock with the sybmol and name
 * 	A method named getChangePercent that retuns the percentage changed
 * 		from previousClosingPrice to currentPrice
 */

public class Stock {
	
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = -1;
		this.currentPrice = -1;
	}
	
	public double getPercentChange() {
		return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getPreviousClosingPrice() {
		return this.previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public String getName() {
		return this.name;
	}
	
}