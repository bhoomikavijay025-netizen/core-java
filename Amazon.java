class Amazon {

   
    static int checkOrder(String product) {

        int price = 0;

        if ("laptop".equals(product)) {
            System.out.println("product is: " + product);
            price = 50000;

        } else if ("mobile".equals(product)) {
            System.out.println("product is: " + product);
            price = 25000;

        } else if ("headphone".equals(product)) {
            System.out.println("product is: " + product);
            price = 5000;

        } else if ("earphone".equals(product)) {
            System.out.println("product is: " + product);
            price = 250;

        } else if ("charger".equals(product)) {
            System.out.println("product is: " + product);
            price = 300;

        } else if ("bluetooth".equals(product)) {
            System.out.println("product is: " + product);
            price = 200;

        } else if ("tv".equals(product)) {
            System.out.println("product is: " + product);
            price = 10000;

        } else if ("computers".equals(product)) {
            System.out.println("product is: " + product);
            price = 27000;

        } else if ("camera".equals(product)) {
            System.out.println("product is: " + product);
            price = 15000;

        } else if ("smart home".equals(product)) {
            System.out.println("product is: " + product);
            price = 25300;

        } else if ("speaker".equals(product)) {
            System.out.println("product is: " + product);
            price = 16000;

        } else if ("battery".equals(product)) {
            System.out.println("product is: " + product);
            price = 1200;

        } else {
            System.out.println("no item found");
            return 0;
        }

        return price; 
    }


    static int checkItem(String product, int price, int noItems) {

        int totalPrice = 0;

        if ("laptop".equals(product)) {
            totalPrice = price * noItems;
            return totalPrice;

        } else if ("bluetooth".equals(product)) {
            totalPrice = price * noItems;
            return totalPrice;

        } else {
            return 0;
        }
    }
}