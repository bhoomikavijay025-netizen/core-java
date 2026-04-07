class FoodPandaRunner {

    public static void main(String[] args) {

        int price = FoodPanda.checkPizza("burger");
        System.out.println("Single Price: " + price);

        int total = FoodPanda.calculateBill("burger", price, 3);
        System.out.println("Total Price: " + total);
    }
}