class MoreMore {

 void display() {
        String[] groceries = {
  "Butter","Milk","Curd","Cheese","Paneer", "Rice","Wheat","Sugar","Salt","Oil","Dal","Tea","Coffee","Spices","Flour"};

   String[] clothing = {
  "Blazer","Hoodie","Cap","Scarf","Gloves", "Shirt","Pant","Tshirt","Jeans","Jacket","Kurta","Saree","Shorts","Skirt","Sweater", };

        String[] electronics = {
            "Oven","Mobile","AirCooler","Fan","AC","CCtv","Iron","Speaker","Camera","Headphones",
            "Tablet","Watch","Charger","Mixer","Tv" };
  String[] homeItems = {
    "Blanket","Table","Table","Bed","Cupboard","Cot","Bucket","Mug","Mat","Curtains","Pillow","Bed","Lamp","Clock","Mirror"};

    String[] snacks = {
  "Potatochips","Biscuits","Chocolate","Pufs","Juice","Cake","Cookies","Popcorn","bun","SoftDrink","IceCream","Candy"
  ,"Dilpasan", "Brownie","Pastry"  };

    String[][] sections = {groceries, clothing, electronics, homeItems, snacks};

    for (int i = 0; i < sections.length; i++) {
      System.out.println("Section " + i);
       for (int j = 0; j < sections[i].length; j++) {
      System.out.println("Index : " + j);
       System.out.println(sections[i][j]);
}
 }
  System.out.println("---- MoreMore FOR EACH ----");
   int sec = 0;
    for (String[] section : sections) {
       System.out.println("Section " + sec);
     sec++;
     int index = 0;
     for (String item : section) {
        System.out.println("Index : " + index);
           System.out.println(item);
            index++;
}
 }
  }
}