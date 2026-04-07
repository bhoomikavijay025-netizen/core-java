class GitDirect {

    static int checkItem(String item) {

        int price = 0;

        if (item == "laptop") {
            System.out.println("item is: " + item);
            price = 50000;
            return price;

        } else if (item == "mobile") {
            System.out.println("item is: " + item);
            price = 20000;
            return price;

        } else if (item == "tablet") {
            System.out.println("item is: " + item);
            price = 15000;
            return price;

        } else if (item == "headphone") {
            System.out.println("item is: " + item);
            price = 3000;
            return price;

        } else if (item == "earphone") {
            System.out.println("item is: " + item);
            price = 500;
            return price;

        } else if (item == "charger") {
            System.out.println("item is: " + item);
            price = 700;
            return price;

        } else if (item == "powerbank") {
            System.out.println("item is: " + item);
            price = 1200;
            return price;

        } else if (item == "camera") {
            System.out.println("item is: " + item);
            price = 25000;
            return price;

        } else if (item == "smartwatch") {
            System.out.println("item is: " + item);
            price = 5000;
            return price;

        } else if (item == "speaker") {
            System.out.println("item is: " + item);
            price = 4000;
            return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int totalAmount(String item, int price, int quantity) {

        int total = 0;

        if (item == "laptop") {
            total = price * quantity;
            return total;

        } else if (item == "mobile") {
            total = price * quantity;
            return total;

        } else {
            return 0;
        }
    }
}