class DoorDashRunner {

    public static void main(String[] args) {

        int price = DoorDash.checkFood("pizza");
        System.out.println("Price: " + price);

        int total = DoorDash.calculateBill("pizza", price, 3);
        System.out.println("Total: " + total);
    }
}