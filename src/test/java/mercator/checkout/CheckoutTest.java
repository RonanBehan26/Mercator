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

    // Test case to verify the total cost calculation with a mix of apples and oranges
    @Test
    public void testCostOfFruit(){
        String[] input = {"Apple", "Apple", "Orange", "Orange", "Orange"};
        double expectedTotalPrice = (checkout.getApplePrice()) + (checkout.getOrangePrice() * 2);
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    // Test case to verify the total cost calculation with a mix of apples, oranges and bananas
    @Test
    public void testCostOfFruitWithApplesOrangesAndBananas(){
        String[] input = {"Apple", "Apple", "Orange", "Orange", "Orange", "Bananas", "Bananas"};
        double expectedTotalPrice = 1.10;
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    // Test case to verify the total cost calculation, just apples
    @Test
    public void testCostOfFruitWithApplesOnly(){
        String[] input = {"Apple", "Apple", "Apple", "Apple"};
        double expectedTotalPrice = checkout.getApplePrice()*2;
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    // Test case to verify the total cost calculation, just oranges
    @Test
    public void testCostOfFruitWithOrangesOnly(){
        String[] input = {"Orange", "Orange", "Orange", "Orange", "Orange", "Orange"};
        double expectedTotalPrice = checkout.getOrangePrice()*4;
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    // Test case to verify the total cost calculation, just bananas
    @Test
    public void testCostOfFruitWithBananasOnly(){
        String[] input = {"Banana", "Banana", "Banana", "Banana", "Banana", "Banana", "Banana"};
        double expectedTotalPrice = 0.8; // Buy one, get one free for bananas
        assertEquals(expectedTotalPrice, checkout.costOfFruit(input));
    }

    // Test case to verify the total cost calculation of null input
    @Test
    public void testCostOfFruitWithNullInput(){
        String[] input = null;
        assertEquals(0, checkout.costOfFruit(input));
    }

    // Test case to verify the total cost calculation of empty array input
    @Test
    public void testCostOfFruitWithEmptyInput() {
        String[] input = {};
        assertEquals(0, checkout.costOfFruit(input));
    }
}