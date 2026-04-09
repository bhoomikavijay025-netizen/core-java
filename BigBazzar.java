class BigBazzar {

  void display(){
   String[] food = new String[8];
    food[0] = "Rice";
    food[1] = "Flour";
    food[2] = "Sugar";
    food[3] = "Salt";
    food[4] = "Oil";
    food[5] = "Spices";
    food[6] = "Tea";
    food[7] = "Coffee";

  String[] gadgets = new String[8];
    gadgets[0] = "Mobile";
     gadgets[1] = "Laptop";
   gadgets[2] = "Tablet";
    gadgets[3] = "Speaker";
    gadgets[4] = "Camera";
    gadgets[5] = "Headphones";
    gadgets[6] = "Fan";
    gadgets[7] = "AC";
           String[] fashion = new String[8];
        fashion[0] = "Shirt";
        fashion[1] = "Jeans";
        fashion[2] = "Tshirt";
        fashion[3] = "Jacket";
        fashion[4] = "Kurta";
        fashion[5] = "Saree";
        fashion[6] = "Skirt";
        fashion[7] = "Shorts";

   String[] homeItems = new String[8];
   homeItems[0] = "Chair";
	homeItems[1] = "Table";
   homeItems[2] = "Bed";
   homeItems[3] = "Sofa";
    homeItems[4] = "Cupboard";
    homeItems[5] = "Mirror";
    homeItems[6] = "Bucket";
    homeItems[7] = "Mug";

    String[][] sections = {food, gadgets, fashion, homeItems};
    System.out.println("----for loop ----");
    for (int i = 0; i < sections.length; i++) {
    System.out.println("Section " + i);

  for (int j = 0; j < sections[i].length; j++) {
   System.out.println("Index : " + j);
    System.out.println(sections[i][j]);
 }
 }
  System.out.println("-- BigBazzar---");
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