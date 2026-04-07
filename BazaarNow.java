class BazaarNow {

    static int checkProduct(String item) {

        int price = 0;

        if (item == "kurti") {
            System.out.println("item is: " + item);
            price = 800;
            return price;

        } else if (item == "pant") {
            System.out.println("item is: " + item);
            price = 1200;
            return price;

        } else if (item == "top") {
            System.out.println("item is: " + item);
            price = 2000;
            return price;

        } else if (item == "watch") {
            System.out.println("item is: " + item);
            price = 1500;
            return price;

        } else if (item == "bag") {
            System.out.println("item is: " + item);
            price = 1000;
            return price;

        } else if (item == "belt") {
            System.out.println("item is: " + item);
            price = 500;
            return price;

        } else if (item == "cap") {
            System.out.println("item is: " + item);
            price = 300;
            return price;

        } else if (item == "jacket") {
            System.out.println("item is: " + item);
            price = 2500;
            return price;

        } else if (item == "jeans") {
            System.out.println("item is: " + item);
            price = 1800;
            return price;

        } else if (item == "socks") {
            System.out.println("item is: " + item);
            price = 200;
            return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int calculateTotal(String item, int price, int quantity) {

        int total = 0;

        if (item == "top") {
            total = price * quantity;
            return total;

        } else if (item == "pant") {
            total = price * quantity;
            return total;

        } else {
            return 0;
        }
    }
}