class SparHypermarket {
      void display() {
   String[] makeup = new String[15];
   makeup[0] = "Lipstick";
    makeup[1] = "Foundation";
    makeup[2] = "Compact";
    makeup[3] = "Eyeliner";
    makeup[4] = "Mascara";
  makeup[5] = "Blush";
     makeup[6] = "Highlighter";
     makeup[7] = "Primer";
     makeup[8] = "Concealer";
     makeup[9] = "LipGloss";
     makeup[10] = "NailPolish";
   makeup[11] = "MakeupRemover";
  makeup[12] = "FacePowder";
    makeup[13] = "EyebrowPencil";
    makeup[14] = "SettingSpray";

  String[] skincare = new String[15];
   skincare[0] = "FaceWash";
   skincare[1] = "Moisturizer";
   skincare[2] = "Sunscreen";
   skincare[3] = "Serum";
  skincare[4] = "Toner";
    skincare[5] = "FaceMask";
    skincare[6] = "Scrub";
    skincare[7] = "NightCream";
    skincare[8] = "DayCream";
    skincare[9] = "EyeCream";
    skincare[10] = "BodyLotion";
    skincare[11] = "Cleanser";
    skincare[12] = "FaceOil";
     skincare[13] = "LipBalm";
    skincare[14] = "AloeGel";

   String[] haircare = new String[15];
    haircare[0] = "Shampoo";
    haircare[1] = "Conditioner";
    haircare[2] = "HairOil";
    haircare[3] = "HairGel";
    haircare[4] = "HairSpray";
    haircare[5] = "HairMask";
    haircare[6] = "Serum";
    haircare[7] = "Comb";
  haircare[8] = "HairBrush";
    haircare[9] = "HairColor";
    haircare[10] = "DryShampoo";
     haircare[11] = "HairCream";
      haircare[12] = "Clips";
      haircare[13] = "Bands";
      haircare[14] = "Straightener";

     String[] perfumes = new String[15];
        perfumes[0] = "RosePerfume";
        perfumes[1] = "JasminePerfume";
        perfumes[2] = "LavenderPerfume";
        perfumes[3] = "VanillaPerfume";
        perfumes[4] = "MuskPerfume";
        perfumes[5] = "FloralMist";
        perfumes[6] = "BodySpray";
        perfumes[7] = "Deodorant";
        perfumes[8] = "AquaPerfume";
        perfumes[9] = "FreshMist";
        perfumes[10] = "WoodyPerfume";
        perfumes[11] = "CitrusPerfume";
        perfumes[12] = "NightPerfume";
        perfumes[13] = "DayPerfume";
        perfumes[14] = "LuxuryPerfume";

    String[][] sections = {makeup, skincare, haircare, perfumes};

   System.out.println("-^^for loop ^^^6");
   for (int i = 0; i < sections.length; i++) {
    System.out.println("Section " + i);
  for (int j = 0; j < sections[i].length; j++) {
    System.out.println("Index : " + j);
      System.out.println(sections[i][j]);
 }
  }
  System.out.println("^^^^^^FOR EACH ----");
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