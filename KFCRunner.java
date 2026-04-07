class KFCRunner {

    public static void main(String[] args) {

        int price = KFC.checkItem("zinger burger");
        System.out.println("Price: " + price);

        int total = KFC.totalAmount("zinger burger", price, 2);
        System.out.println("Total: " + total);
    }
}