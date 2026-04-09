class VishalMart {

    void display() {

     String[] foodItems = new String[8];
    foodItems[0] = "Rice";
     foodItems[1] = "Oil";
     foodItems[2] = "Sugar";
     foodItems[3] = "Salt";
     foodItems[4] = "Grains";
     foodItems[5] = "Tea";
     foodItems[6] = "Coffee";
     foodItems[7] = "Flour";

   String[] gadgets = new String[8];
    gadgets[0] = "Mobile";
    gadgets[1] = "Headphone";
    gadgets[2] = "TV";
    gadgets[3] = "Fan";
    gadgets[4] = "AC";
    gadgets[5] = "Fridge";
    gadgets[6] = "Iron";
    gadgets[7] = "Speaker";

  String[] fashion = new String[8];
    fashion[0] = "Shirt";
    fashion[1] = "Pant";
    fashion[2] = "Tshirt";
     fashion[3] = "Jeans";
     fashion[4] = "Nightdress";
     fashion[5] = "Kurta";
     fashion[6] = "Saree";
        fashion[7] = "Shorts";

   String[] houseItems = new String[8];
    houseItems[0] = "Chair";
     houseItems[1] = "Table";
     houseItems[2] = "Sofa";
     houseItems[3] = "Bed";
     houseItems[4] = "Mirror";
     houseItems[5] = "Bucket";
     houseItems[6] = "Mug";
     houseItems[7] = "Mat";

    String[][] sections = {foodItems, gadgets, fashion, houseItems};

     for (int i = 0; i < sections.length; i++) {
       System.out.println("Section " + i);

     for (int j = 0; j < sections[i].length; j++) {
       System.out.println("Index value : " + j);
       System.out.println(sections[i][j]);
    }
}
  int sec = 0;
  for (String[] section : sections) {
  System.out.println("Section " + sec);
      int index = 0;
	       sec++;
      for (String item : section) {
       System.out.println("Index value : " + index);
        System.out.println(item);
        index++;
  }
 }
 }
}