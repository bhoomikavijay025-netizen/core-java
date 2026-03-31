class Pen {

    static void getPen() {
        System.out.println("This is Pen information");
    }
    static void tosay(boolean isBlueInk) {
        System.out.println("Blue Ink: " + isBlueInk);
    }

    static String getBrand() {
        return "Reynolds";
    }
    static int totalCost(int price, int quantity) {
        int total = price * quantity;
        return total;
    }
}