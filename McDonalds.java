class McDonalds {

    static int checkItem(String item) {

        int price = 0;

        if (item == "mcAlooTikki") {
            System.out.println("item is: " + item);
            price = 60;
            return price;

        } else if (item == "mcVeggie") {
            System.out.println("item is: " + item);
            price = 120;
            return price;

        } else if (item == "mcChicken") {
            System.out.println("item is: " + item);
            price = 150;
            return price;

        } else if (item == "fries") {
            System.out.println("item is: " + item);
            price = 90;
            return price;

        } else if (item == "coke") {
            System.out.println("item is: " + item);
            price = 70;
            return price;

        } else if (item == "mcFlurry") {
            System.out.println("item is: " + item);
            price = 110;
            return price;

        } else if (item == "nuggets") {
            System.out.println("item is: " + item);
            price = 180;
            return price;

        } else if (item == "wrap") {
            System.out.println("item is: " + item);
            price = 140;
            return price;

        } else if (item == "coffee") {
            System.out.println("item is: " + item);
            price = 100;
            return price;

        } else if (item == "brownie") {
            System.out.println("item is: " + item);
            price = 130;
            return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int totalPrice(String item, int price, int qty) {

        if (item == "mcAlooTikki") {
            return price * qty;
        } else if (item == "mcChicken") {
            return price * qty;
        } else {
            return 0;
        }
    }
}