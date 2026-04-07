class ZeptoRunner {

    public static void main(String[] args) {

        int price = Zepto.checkItem("milk");
        System.out.println("Single Price: " + price);

        int total = Zepto.totalAmount("milk", price, 5);
        System.out.println("Total Price: " + total);
    }
}