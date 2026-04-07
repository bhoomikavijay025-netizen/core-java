class KFC {

    static int checkItem(String item) {

        int price = 0;

        if (item == "chicken bucket") {
            System.out.println("item is: " + item);
            price = 600;
            return price;

        } else if (item == "zinger burger") {
            System.out.println("item is: " + item);
            price = 200;
            return price;

        } else if (item == "popcorn chicken") {
            System.out.println("item is: " + item);
            price = 180;
            return price;

        } else if (item == "chicken wings") {
            System.out.println("item is: " + item);
            price = 220;
            return price;

        } else if (item == "chicken strips") {
            System.out.println("item is: " + item);
            price = 250;
            return price;

        } else if (item == "fries") {
            System.out.println("item is: " + item);
            price = 100;
            return price;

        } else if (item == "coke") {
            System.out.println("item is: " + item);
            price = 80;
            return price;

        } else if (item == "pepsi") {
            System.out.println("item is: " + item);
            price = 80;
            return price;

        } else if (item == "icecream") {
            System.out.println("item is: " + item);
            price = 90;
            return price;

        } else if (item == "brownie") {
            System.out.println("item is: " + item);
            price = 120;
            return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int totalAmount(String item, int price, int qty) {

        if (item == "chicken bucket") {
            return price * qty;
        } else if (item == "zinger burger") {
            return price * qty;
        } else {
            return 0;
        }
    }
}