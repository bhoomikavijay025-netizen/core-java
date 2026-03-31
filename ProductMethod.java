class ProductMethods {

    public static void main(String[] args) {
        showProduct();

        showPrice(25000, 30000);

        int stock = getStock();
        System.out.println("Stock available: " + stock);

        int total = calculateTotal(20000, 5000);
        System.out.println("Total price: " + total);
    }
    public static void showProduct() {
        System.out.println("Product: Mobile Phone");
    }
    public static void showPrice(int price1, int price2) {
        System.out.println("Price 1: " + price1);
        System.out.println("Price 2: " + price2);
    }
    public static int getStock() {
    return 50;
    }
    public static int calculateTotal(int a, int b) {
   return a + b;
    }
}