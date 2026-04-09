class MegaMart {
  void display() {
    String[] grocerySection = new String[12];
  grocerySection[0] = "Rice";
    grocerySection[1] = "Sugar";
    grocerySection[2] = "Salt";
     grocerySection[3] = "Oil";
     grocerySection[4] = "Dal";
     grocerySection[5] = "Tea";
    grocerySection[6] = "Coffee";
    grocerySection[7] = "Spices";
     grocerySection[8] = "Flour";
     grocerySection[9] = "Butter";
     grocerySection[10] = "Milk";
     grocerySection[11] = "Curd";

   String[] clothingSection = new String[12];
   clothingSection[0] = "Shirt";
    clothingSection[1] = "Pant";
    clothingSection[2] = "Tshirt";
     clothingSection[3] = "Jeans";
     clothingSection[4] = "Jacket";
     clothingSection[5] = "Kurta";
     clothingSection[6] = "Saree";
     clothingSection[7] = "Shorts";
     clothingSection[8] = "Skirt";
    clothingSection[9] = "Sweater";
     clothingSection[10] = "Blazer";
     clothingSection[11] = "Hoodie";

   String[] gadgetSection = new String[12];
    gadgetSection[0] = "Mobile";
     gadgetSection[1] = "Laptop";
     gadgetSection[2] = "Tablet";
      gadgetSection[3] = "Camera";
      gadgetSection[4] = "Speaker";
      gadgetSection[5] = "Headphones";
      gadgetSection[6] = "TV";
      gadgetSection[7] = "Fan";
      gadgetSection[8] = "AC";
      gadgetSection[9] = "Fridge";
      gadgetSection[10] = "Iron";
      gadgetSection[11] = "Watch";

    String[][] sections = {grocerySection, clothingSection, gadgetSection};
    System.out.println("~~~~MegaMart first~~~~~");
     for (int i = 0; i < sections.length; i++) {
       System.out.println("Section " + i);
	   for (int j = 0; j < sections[i].length; j++) {
        System.out.println("Index : " + j);
          System.out.println(sections[i][j]);
 }
 }
  System.out.println("#### MegaMart sec####");
   int sec = 0;
    for (String[] section : sections) {
     System.out.println("Section " + sec);
      int index = 0;
	   sec++;
      for (String item : section) {
       System.out.println( index);
        System.out.println(item);
        index++;
}
  }
  }
}