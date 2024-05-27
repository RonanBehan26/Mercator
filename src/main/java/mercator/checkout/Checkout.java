package mercator.checkout;

public class Checkout {

    private static double APPLE_PRICE = 0.60;
    private static double ORANGE_PRICE = 0.25;

    public double costOfFruit(String[] input){
        if (input == null) {
            return 0; // Return 0 if input is null
        }

        double totalPrice = 0;

        for(String fruit: input){
            if(fruit.equals("Apple")){
                totalPrice+= APPLE_PRICE;
            }else if(fruit.equals("Orange")){
                totalPrice+= ORANGE_PRICE;
            }
        }

        return totalPrice;
    }

    public double getApplePrice() {
        return APPLE_PRICE;
    }

    public double getOrangePrice() {
        return ORANGE_PRICE;
    }


}
