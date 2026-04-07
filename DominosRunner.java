class DominosRunner {

    public static void main(String[] args) {

        int price = Dominos.checkPizza("veg pizza");
        System.out.println("Single Price: " + price);

        int total = Dominos.calculateBill("veg pizza", price, 3);
        System.out.println("Total Price: " + total);
    }
}