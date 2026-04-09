class Dmart {

    void displaySections() {

    String[] groceries = new String[10];
    groceries[0] = "Rice";
   groceries[1] = "Wheat";
        groceries[2] = "Sugar";
        groceries[3] = "Salt";
        groceries[4] = "Oil";
        groceries[5] = "Dal";
        groceries[6] = "Tea";
        groceries[7] = "Coffee";
        groceries[8] = "Spices";
        groceries[9] = "Flour";

        String[] electronics = new String[10];
        electronics[0] = "TV";
        electronics[1] = "Mobile";
        electronics[2] = "Laptop";
        electronics[3] = "Fan";
        electronics[4] = "AC";
        electronics[5] = "Fridge";
        electronics[6] = "Iron";
        electronics[7] = "Speaker";
        electronics[8] = "Camera";
        electronics[9] = "Headphones";

        String[] clothes = new String[10];
        clothes[0] = "Shirt";
        clothes[1] = "Pant";
        clothes[2] = "Tshirt";
        clothes[3] = "Jeans";
        clothes[4] = "Jacket";
        clothes[5] = "Kurta";
        clothes[6] = "Saree";
        clothes[7] = "Shorts";
        clothes[8] = "Skirt";
        clothes[9] = "Sweater";

        String[] home = new String[10];
        home[0] = "Chair";
        home[1] = "Table";
        home[2] = "Sofa";
        home[3] = "Bed";
        home[4] = "Pillow";
        home[5] = "Mirror";
        home[6] = "Bucket";
        home[7] = "Mug";
        home[8] = "Mat";
        home[9] = "Curtains";

        String[] snacks = new String[10];
        snacks[0] = "Chips";
        snacks[1] = "Biscuits";
        snacks[2] = "Chocolate";
        snacks[3] = "Noodles";
        snacks[4] = "Juice";
        snacks[5] = "Cake";
        snacks[6] = "Cookies";
        snacks[7] = "Popcorn";
        snacks[8] = "maggie";
        snacks[9] = "SoftDrink";

   String[][] sections = {groceries, electronics, clothes, home, snacks};

        System.out.println("---- FOR LOOP ----");
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
            sec++;
            int index = 0;
            for (String product : section) {
                System.out.println("Index value : " + index);
                System.out.println(product);
                index++;
            }
              }
    }
}