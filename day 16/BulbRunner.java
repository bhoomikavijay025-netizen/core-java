class BulbRunner {

    public static void main(String[] args) {

        System.out.println("Bulb Details");
        Bulb.getBulb();
        Bulb.tosay( 9, true);
        String brandName = Bulb.getBrand();
        System.out.println("Brand Name: " + brandName);
        int totalAmount = Bulb.totalPrice(150, 3);
        System.out.println("Total Price: " + totalAmount);
    }
}