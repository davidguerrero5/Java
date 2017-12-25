package edu.albany.hw2.stock;

public class Stock {

	private enum Symbol {
		MSFT("Microsoft"), AAPL("Apple"), GOOGL("Google"), AMZN("Amazon"), ATT("AT&T");

		private String stockSymbol;

		// constructor that creates a stock with specified symbol and name
		private Symbol(String stockSymbol) {
			this.stockSymbol = stockSymbol;
		}

		public String getStockSymbol() {
			return stockSymbol;
		}

	}

	Symbol symbol;
	private double previousClosingPrice;
	private double currentPrice;

	private Stock(Symbol symbol) {
		this.symbol = symbol;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	// returns the percentage changed from previousClosingPrice to currentPrice
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / (previousClosingPrice)) * 100;
	}

	public static void main(String[] args) {

		// creates a new stock object
		Stock stock = new Stock(Symbol.MSFT);

		// sets the closing price to 100 and the current price to 150
		stock.setPreviousClosingPrice(58.9);
		stock.setCurrentPrice(59);

		// prints the change percentage
		System.out.println("Price change: " + stock.getChangePercent() + "%");

		// creates a new stock object
		Stock stock2 = new Stock(Symbol.GOOGL);

		// sets the closing price to 100 and the current price to 150
		stock2.setPreviousClosingPrice(100);
		stock2.setCurrentPrice(150);

		// prints the change percentage
		System.out.println("Price change: " + stock2.getChangePercent() + "%");

	}

}