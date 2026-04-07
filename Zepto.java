class Zepto {

    static int checkItem(String item) {

        int price = 0;

        if (item == "milk") {
            System.out.println("item is: " + item);
            price = 50;
            return price;

        } else if (item == "bread") {
            System.out.println("item is: " + item);
            price = 40;
            return price;

        } else if (item == "eggs") {
            System.out.println("item is: " + item);
            price = 70;
            return price;

        } else if (item == "rice") {
            System.out.println("item is: " + item);
            price = 120;
            return price;

        } else if (item == "oil") {
            System.out.println("item is: " + item);
            price = 150;
            return price;

        } else if (item == "sugar") {
            System.out.println("item is: " + item);
            price = 60;
            return price;

        } else if (item == "salt") {
            System.out.println("item is: " + item);
            price = 20;
            return price;

        } else if (item == "soap") {
            System.out.println("item is: " + item);
            price = 35;
            return price;

        } else if (item == "shampoo") {
            System.out.println("item is: " + item);
            price = 120;
            return price;

        } else if (item == "biscuits") {
            System.out.println("item is: " + item);
            price = 30;
            return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int totalAmount(String item, int price, int quantity) {

        int total = 0;

        if (item == "milk") {
            total = price * quantity;
            return total;

        } else if (item == "bread") {
            total = price * quantity;
            return total;

        } else {
            return 0;
        }
    }
}