package stocks;

import java.util.*;

public class StocksPortfolio {
    private List<Stock> stocks = new ArrayList<>();
    private IStockmarketService stockmarket;

    public StocksPortfolio(IStockmarketService stockmarket){
        this.stockmarket = stockmarket;
    }

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public double getTotalValue() {
        double val = 0;
        for(int i=0; i<stocks.size(); i++){
            val += stockmarket.getPrice(stocks.get(i).getLabel()) * stocks.get(i).getQuantity();
        }
        return val;
    }
}
