class PizzaHut {

    static int checkPizza(String item) {

        int price = 0;

        if ("margherita".equals(item)) {
            price = 200;
        } else if ("farmhouse".equals(item)) {
            price = 350;
        } else if ("paneer pizza".equals(item)) {
            price = 400;
        } else if ("chicken pizza".equals(item)) {
            price = 450;
        } else if ("veggie pizza".equals(item)) {
            price = 300;
        } else if ("cheese pizza".equals(item)) {
            price = 380;
        } else if ("corn pizza".equals(item)) {
            price = 320;
        } else if ("onion pizza".equals(item)) {
            price = 280;
        } else if ("tomato pizza".equals(item)) {
            price = 260;
        } else if ("spicy pizza".equals(item)) {
            price = 420;
        } else if ("tandoori pizza".equals(item)) {
            price = 500;
        } else if ("mexican pizza".equals(item)) {
            price = 470;
        } else if ("deluxe pizza".equals(item)) {
            price = 550;
        } else {
            System.out.println("no item found");
            return 0;
        }

        System.out.println("item is: " + item);
        return price;
    }

    static int totalBill(String item, int price, int qty) {

        if ("margherita".equals(item) || "deluxe pizza".equals(item)) {
            return price * qty;
        } else {
            return 0;
        }
    }
}