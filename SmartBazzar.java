class SmartBazzar{

 void display(){

 String[] foodItems = new String[12];
  foodItems[0] = "Peanut";
   foodItems[1] = "Wheatflour";
   foodItems[2] = "Riceflour";
    foodItems[3] = "Salt";
  foodItems[4] = "Grains";
   foodItems[5] = "Maida";
   foodItems[6] = "Cornflour";
   foodItems[7] = "Coffee";
    foodItems[8] = "Spices";
    foodItems[9] = "GramFlour";
    foodItems[10] = "Butter";
    foodItems[11] = "Milk";

 String[] fashionItems = new String[12];
    fashionItems[0] = "Cordset";
   fashionItems[1] = "Sharara";
   fashionItems[2] = "Shirt";
   fashionItems[3] = "Ubrella";
   fashionItems[4] = "Skart";
   fashionItems[5] = "Kurta";
   fashionItems[6] = "Saree";
   fashionItems[7] = "pant";
   fashionItems[8] = "Skirt";
   fashionItems[9] = "Sweater";
   fashionItems[10] = "Blazer";
    fashionItems[11] = "Hoodie";

   String[] electronicsItems = new String[12];
    electronicsItems[0] = "Earphone";
    electronicsItems[1] = "Mobile";
    electronicsItems[2] = "Laptop";
    electronicsItems[3] = "Fan";
     electronicsItems[4] = "Tv";
     electronicsItems[5] = "Fridge";
    electronicsItems[6] = "Iron";
    electronicsItems[7] = "Speaker";
    electronicsItems[8] = "Camera";
    electronicsItems[9] = "Headphones";
     electronicsItems[10] = "Ac";
     electronicsItems[11] = "Watch";

  String[][] sections = {foodItems, fashionItems, electronicsItems};

    for (int i = 0; i < sections.length; i++) {
     System.out.println("Section " + i);

    for (int j = 0; j < sections[i].length; j++) {
      System.out.println("Index : " + j);
       System.out.println(sections[i][j]);
 }
  }
  int sec = 0;
   for (String[] section : sections) {
    System.out.println("Section:"+ sec);
   sec++;
    int index = 0;
     for (String item : section) {
      System.out.println(index);
       System.out.println(item);
        index++;
 }
 }
 }
}