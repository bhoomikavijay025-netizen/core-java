class Pillow {

    int getPrice() {
     int price = 300;
      System.out.println(price);
	  return price;
    }

    void displayType(String type) {
     System.out.println(" type is :" + type);
     int price = getPrice();
     System.out.println(price);
    }

    void showDetails() {
      System.out.println("Pillow details");

        displayType("Soft Pillow");
    }
}