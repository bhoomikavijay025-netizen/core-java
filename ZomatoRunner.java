class ZomatoRunner {
    public static void main(String[] args) {

        int price = Zomato.checkFood("biryani");
        System.out.println("Price: " + price);

        int total = Zomato.calculateTotal("biryani", price, 2);
        System.out.println("Total: " + total);
    }
}