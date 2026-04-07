class DoorDash {

    static int checkFood(String item) {

        int price = 0;

        if (item == "pizza") {
            System.out.println("item is: " + item);
            price = 300;
            return price;

        } else if (item == "burger") {
            System.out.println("item is: " + item);
            price = 150;
            return price;

        } else if (item == "biryani") {
            System.out.println("item is: " + item);
            price = 260;
            return price;

        } else if (item == "pasta") {
            System.out.println("item is: " + item);
            price = 220;
            return price;

        } else if (item == "noodles") {
            System.out.println("item is: " + item);
            price = 170;
            return price;

        } else if (item == "fries") {
            System.out.println("item is: " + item);
            price = 100;
            return price;

        } else if (item == "shawarma") {
            System.out.println("item is: " + item);
            price = 140;
            return price;

        } else if (item == "sandwich") {
            System.out.println("item is: " + item);
            price = 120;
            return price;

        } else if (item == "cake") {
            System.out.println("item is: " + item);
            price = 250;
            return price;

        } else if (item == "icecream") {
            System.out.println("item is: " + item);
            price = 90;
            return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int calculateBill(String item, int price, int qty) {

        if (item == "pizza") {
            return price * qty;
        } else if (item == "burger") {
            return price * qty;
        } else {
            return 0;
        }
    }
}