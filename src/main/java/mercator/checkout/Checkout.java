package mercator.checkout;

public class Checkout {

    private static double APPLE_PRICE = 0.60;
    private static double ORANGE_PRICE = 0.25;
    private static double BANANA_PRICE = 0.20;

    public double costOfFruit(String[] input){
        if (input == null) {
            return 0; // Return 0 if input is null
        }

        //Now we want to count our fruit so that we can put on the offers
        int noOfApples = 0;
        int noOfOranges = 0;
        int noOfBananas = 0;

        double totalPrice;

        for(String fruit: input){
            if(fruit.equals("Apple")){
                noOfApples++;
            }else if(fruit.equals("Orange")){
                noOfOranges++;
            }else if(fruit.equals("Banana")){
                noOfBananas++;
            }
        }

        //Calculate total price for apples
        double applePrice = ((double)noOfApples/2 + noOfApples%2) * APPLE_PRICE;

        //Calculate total price for oranges
        double orangePrice = ((double) noOfOranges / 3 * 2 + noOfOranges % 3) * ORANGE_PRICE;

        //Calculate total price for bananas
        double bananaPrice = ((double) (noOfBananas / 2) + (noOfBananas % 2)) * BANANA_PRICE;



        if(noOfApples > 0 && noOfBananas > 0){
            // Calculate the total price for apples and bananas considering the criteria of step 3
            double minPrice = Math.min(applePrice, bananaPrice);
            totalPrice = applePrice + orangePrice + bananaPrice - minPrice;
        }else{
            totalPrice = applePrice + orangePrice + bananaPrice;
        }

        return totalPrice;
    }

    public double getApplePrice() {
        return APPLE_PRICE;
    }

    public double getOrangePrice() {
        return ORANGE_PRICE;
    }

    public double getBananaPrice() {
        return BANANA_PRICE;
    }


}
