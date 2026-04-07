class Book{
     static int getPrice(){
      int price = 500;
       System.out.println(price);
       return price;
 }
    static void displayName(String name) {
   System.out.println( "Book name is:" +name);
   int price = getPrice();
    System.out.println( "**:" + price);
 }
    static void showDetails() {
    System.out.println("Book details");

      displayName("Social");
   }
}