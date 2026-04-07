class PizzaHutRunner {
    public static void main(String[] args) {

        int price = PizzaHut.checkPizza("margherita");
        System.out.println("Price: " + price);

        int total = PizzaHut.totalBill("margherita", price, 5);
        System.out.println("Total: " + total);
    }
}