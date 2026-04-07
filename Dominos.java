class Dominos {

    static int checkPizza(String item) {

        int price = 0;

        if ("margherita".equals(item)) {
            System.out.println("item is: " + item);
            price = 200;
        } else if ("farmhouse".equals(item)) {
            System.out.println("item is: " + item);
            price = 350;
        } else if ("peppy paneer".equals(item)) {
            System.out.println("item is: " + item);
            price = 400;
        } else if ("veggie deluxe".equals(item)) {
            System.out.println("item is: " + item);
            price = 450;
        } else if ("cheese burst".equals(item)) {
            System.out.println("item is: " + item);
            price = 500;
        } else if ("chicken dominator".equals(item)) {
            System.out.println("item is: " + item);
            price = 600;
        } else if ("pepper bbq chicken".equals(item)) {
            System.out.println("item is: " + item);
            price = 550;
        } else if ("paneer makhani".equals(item)) {
            System.out.println("item is: " + item);
            price = 480;
        } else if ("mexican green wave".equals(item)) {
            System.out.println("item is: " + item);
            price = 420;
        } else if ("indian tandoori".equals(item)) {
            System.out.println("item is: " + item);
            price = 530;
        } else {
            System.out.println("no item found");
            return 0;
        }

        return price;
    }

    static int calculateBill(String item, int price, int quantity) {

        int total = 0;

        if ("margherita".equals(item)) {
            total = price * quantity;
            return total;
        } else if ("farmhouse".equals(item)) {
            total = price * quantity;
            return total;
        } else {
            return 0;
        }
    }
}