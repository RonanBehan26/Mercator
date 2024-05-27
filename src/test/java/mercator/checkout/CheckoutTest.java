package mercator.checkout;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {

    private Checkout checkout;

    @BeforeEach
    public void setUp() {
        checkout = new Checkout();
    }

    @Test
    public void testCostOfFruit(){
        String[] input = {"Apple", "Orange"};
        double expectedTotalPrice = checkout.getApplePrice() + checkout.getOrangePrice();
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    @Test
    public void testCostOfFruitWithApplesOnly(){
        String[] input = {"Apple", "Apple"};
        double expectedTotalPrice = checkout.getApplePrice()*2;
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    @Test
    public void testCostOfFruitWithOrangesOnly(){
        String[] input = {"Orange", "Orange", "Orange"};
        double expectedTotalPrice = checkout.getOrangePrice()*3;
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    @Test
    public void testCostOfFruitWithNullInput(){
        String[] input = null;
        assertEquals(0, checkout.costOfFruit(input));
    }


    @Test
    public void testCostOfFruitWithEmptyInput() {
        String[] input = {};
        assertEquals(0, checkout.costOfFruit(input));
    }
}