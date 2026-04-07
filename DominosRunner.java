class DominosRunner {

    public static void main(String[] args) {

        int price = Dominos.checkPizza("margherita");
        System.out.println("Single Price: " + price);

        int total = Dominos.calculateBill("margherita", price, 3);
        System.out.println("Total Price: " + total);
    }
}