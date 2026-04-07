class Dominos {

    static int checkPizza(String item) {

        int price = 0;

        if (item == "veg pizza") {
            System.out.println("item is: " + item);
            price = 200;
            return price;

        } else if (item == "farmhouse") {
            System.out.println("item is: " + item);
            price = 350;
            return price;

        } else if (item == "peppy paneer") {
            System.out.println("item is: " + item);
            price = 400;
            return price;

        } else if (item == "veggie deluxe") {
            System.out.println("item is: " + item);
            price = 450;
            return price;

        } else if (item == "cheese burst") {
            System.out.println("item is: " + item);
            price = 500;
            return price;

        } else if (item == "chicken dominator") {
            System.out.println("item is: " + item);
            price = 600;
            return price;

        } else if (item == "pepper bbq chicken") {
            System.out.println("item is: " + item);
            price = 550;
            return price;

        } else if (item == "paneer makhani") {
            System.out.println("item is: " + item);
            price = 480;
            return price;

        } else if (item == "mexican green wave") {
            System.out.println("item is: " + item);
            price = 420;
            return price;

        } else if (item == "indian tandoori") {
            System.out.println("item is: " + item);
            price = 530;
            return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int calculateBill(String item, int price, int quantity) {

        int total = 0;

        if (item == "veg pizza") {
            total = price * quantity;
            return total;

        } else if (item == "farmhouse") {
            total = price * quantity;
            return total;

        } else {
            return 0;
        }
    }
}