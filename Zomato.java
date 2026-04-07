class Zomato {

    static int checkFood(String item) {

        int price = 0;

        if ("biryani".equals(item)) {
            System.out.println("item is: " + item);
            price = 250;
        } else if ("fried rice".equals(item)) {
            System.out.println("item is: " + item);
            price = 180;
        } else if ("noodles".equals(item)) {
            System.out.println("item is: " + item);
            price = 150;
        } else if ("pizza".equals(item)) {
            System.out.println("item is: " + item);
            price = 300;
        } else if ("burger".equals(item)) {
            System.out.println("item is: " + item);
            price = 120;
        } else if ("sandwich".equals(item)) {
            System.out.println("item is: " + item);
            price = 100;
        } else if ("roll".equals(item)) {
            System.out.println("item is: " + item);
            price = 130;
        } else if ("shawarma".equals(item)) {
            System.out.println("item is: " + item);
            price = 140;
        } else if ("pasta".equals(item)) {
            System.out.println("item is: " + item);
            price = 220;
        } else if ("momos".equals(item)) {
            System.out.println("item is: " + item);
            price = 90;
        } else if ("dosa".equals(item)) {
            System.out.println("item is: " + item);
            price = 80;
        } else if ("idli".equals(item)) {
            System.out.println("item is: " + item);
            price = 60;
        } else if ("meals".equals(item)) {
            System.out.println("item is: " + item);
            price = 200;
        } else {
            System.out.println("no item found");
            return 0;
        }

        return price;
    }

    static int calculateTotal(String item, int price, int qty) {

        if ("biryani".equals(item) || "pizza".equals(item)) {
            return price * qty;
        } else {
            return 0;
        }
    }
}