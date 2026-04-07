class Swiggy {

    static int checkMenu(String item) {

        int price = 0;

        if ("pizza".equals(item)) {
            price = 300;
        } else if ("burger".equals(item)) {
            price = 150;
        } else if ("biryani".equals(item)) {
            price = 260;
        } else if ("shawarma".equals(item)) {
            price = 140;
        } else if ("momos".equals(item)) {
            price = 100;
        } else if ("fries".equals(item)) {
            price = 90;
        } else if ("wrap".equals(item)) {
            price = 130;
        } else if ("pasta".equals(item)) {
            price = 210;
        } else if ("salad".equals(item)) {
            price = 120;
        } else if ("juice".equals(item)) {
            price = 80;
        } else if ("milkshake".equals(item)) {
            price = 110;
        } else if ("cake".equals(item)) {
            price = 250;
        } else if ("icecream".equals(item)) {
            price = 90;
        } else {
            System.out.println("no item found");
            return 0;
        }

        System.out.println("item is: " + item);
        return price;
    }

    static int billAmount(String item, int price, int qty) {

        if ("pizza".equals(item) || "cake".equals(item)) {
            return price * qty;
        } else {
            return 0;
        }
    }
}