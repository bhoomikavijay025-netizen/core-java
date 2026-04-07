class BazaarNowRunner {

    public static void main(String[] args) {

        int price = BazaarNow.checkProduct("kurti");
        System.out.println("Single Price: " + price);

        int total = BazaarNow.calculateTotal("kurti", price, 2);
        System.out.println("Total Price: " + total);
    }
}