package mercator.checkout;

public class Checkout {

    private static double APPLE_PRICE = 0.60;
    private static double ORANGE_PRICE = 0.25;

    public double costOfFruit(String[] input){
        if (input == null) {
            return 0; // Return 0 if input is null
        }

        //Now we want to count our fruit so that we can put on the offers
        int noOfApples = 0;
        int noOfOranges = 0;

        for(String fruit: input){
            if(fruit.equals("Apple")){
                noOfApples++;
            }else if(fruit.equals("Orange")){
                noOfOranges++;
            }
        }

        double totalPrice = ((double) noOfApples/2 + noOfApples%2) * APPLE_PRICE + //buy 1 get 1 free for apples + remainder
                (((double) noOfOranges/3 * 2) + noOfOranges%3) * ORANGE_PRICE;   //3 for the price of 2 for oranges + remainder

        return totalPrice;
    }

    public double getApplePrice() {
        return APPLE_PRICE;
    }

    public double getOrangePrice() {
        return ORANGE_PRICE;
    }


}
