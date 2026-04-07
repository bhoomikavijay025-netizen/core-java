class FoodPanda {

    static int checkPizza(String item) {

       int price = 0;

    if (item == "burger") {
      System.out.println("item is: " + item);
       price = 120;
       return price;

     } else if (item == "sandwich") {
      System.out.println("item is: " + item);
       price = 100;
     return price;

     } else if (item == "biryani") {
      System.out.println("item is: " + item);
     price = 250;
       return price;

    } else if (item == "noodles") {
       System.out.println("item is: " + item);
        price = 150;
       return price;

     } else if (item == "fried rice") {
     System.out.println("item is: " + item);
     price = 180;
     return price;

      } else if (item == "pasta") {
    System.out.println("item is: " + item);
      price = 220;
         return price;
} else if (item == "shawarma") {
   System.out.println("item is: " + item);
      price = 140;
	  return price;

   } else if (item == "momos") {
   System.out.println("item is: " + item);
     price = 90;
      return price;

     } else if (item == "fries") {
      System.out.println("item is: " + item);
       price = 80;
       return price;

        } else if (item == "icecream") {
          System.out.println("item is: " + item);
          price = 70;
         return price;

        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int calculateBill(String item, int price, int quantity) {

        int total = 0;

        if (item == "burger") {
            total = price * quantity;
            return total;

        } else if (item == "biryani") {
            total = price * quantity;
            return total;

        } else {
            return 0;
        }
    }
}