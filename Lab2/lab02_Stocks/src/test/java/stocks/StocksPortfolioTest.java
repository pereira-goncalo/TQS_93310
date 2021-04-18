package stocks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StocksPortfolioTest {

    @Mock
    IStockmarketService stockmarket2;

    @InjectMocks
    StocksPortfolio portfolio2;

    @Test
    void getTotalValue() {
        IStockmarketService stockmarket = mock(IStockmarketService.class);

        StocksPortfolio portfolio = new StocksPortfolio(stockmarket);

        when( stockmarket.getPrice("EBAY")).thenReturn(4.0);
        when( stockmarket.getPrice("MSFT")).thenReturn(1.5);

        portfolio.addStock(new Stock("EBAY", 2));
        portfolio.addStock(new Stock("MSFT", 4));
        double result = portfolio.getTotalValue();

        assertEquals(14.0, result);


    }


}