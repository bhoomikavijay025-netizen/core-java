class StarBazzar {

          void display() {
     String[] cosmetics = new String[15];
        cosmetics[0] = "Lipstick";
        cosmetics[1] = "Foundation";
        cosmetics[2] = "Compact";
        cosmetics[3] = "Kajal";
        cosmetics[4] = "Mascara";
        cosmetics[5] = "Blush";
        cosmetics[6] = "Highlighter";
        cosmetics[7] = "Primer";
        cosmetics[8] = "Concealer";
        cosmetics[9] = "LipTint";
        cosmetics[10] = "NailPolish";
        cosmetics[11] = "Remover";
        cosmetics[12] = "FacePowder";
        cosmetics[13] = "BrowKit";
        cosmetics[14] = "Fixer";
     String[] beauty = new String[15];
        beauty[0] = "FaceWash";
        beauty[1] = "Moisturizer";
        beauty[2] = "Sunscreen";
        beauty[3] = "Serum";
        beauty[4] = "Toner";
        beauty[5] = "Mask";
        beauty[6] = "Scrub";
        beauty[7] = "NightCream";
        beauty[8] = "DayCream";
        beauty[9] = "EyeGel";
        beauty[10] = "BodyLotion";
        beauty[11] = "Cleanser";
        beauty[12] = "FaceOil";
        beauty[13] = "LipBalm";
        beauty[14] = "Gel";

String[] hair = new String[15];
        hair[0] = "Shampoo";
        hair[1] = "Conditioner";
        hair[2] = "Oil";
        hair[3] = "Gel";
        hair[4] = "Spray";
        hair[5] = "Mask";
        hair[6] = "Serum";
        hair[7] = "Comb";
        hair[8] = "Brush";
        hair[9] = "Color";
        hair[10] = "DryShampoo";
        hair[11] = "Cream";
        hair[12] = "Clips";
        hair[13] = "Bands";
        hair[14] = "Straightener";

    String[] fragrance = new String[15];
        fragrance[0] = "Rose";
        fragrance[1] = "Jasmine";
        fragrance[2] = "Lavender";
        fragrance[3] = "Vanilla";
        fragrance[4] = "Musk";
        fragrance[5] = "Mist";
        fragrance[6] = "Spray";
        fragrance[7] = "Deo";
        fragrance[8] = "Aqua";
        fragrance[9] = "Fresh";
        fragrance[10] = "Woody";
        fragrance[11] = "Citrus";
        fragrance[12] = "Night";
        fragrance[13] = "Day";
        fragrance[14] = "Luxury";

   String[][] sections = {cosmetics, beauty, hair, fragrance};

        System.out.println("***** StarBazzar*****");
        for (int i = 0; i < sections.length; i++) {
         System.out.println("Section " + i);
         for (int j = 0; j < sections[i].length; j++) {
           System.out.println("Index : " + j);
            System.out.println(sections[i][j]);
  }
  }
        System.out.println("----for each----");
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