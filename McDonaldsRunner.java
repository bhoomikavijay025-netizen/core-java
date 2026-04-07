class McDonaldsRunner {

    public static void main(String[] args) {

        int price = McDonalds.checkItem("mcChicken");
        System.out.println("Price: " + price);

        int total = McDonalds.totalPrice("mcChicken", price, 2);
        System.out.println("Total: " + total);
    }
}