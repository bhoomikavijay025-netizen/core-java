class EasyBuy{
        void display() {
  String[] slippers = new String[14];
     slippers[0]="FlipFlops";
	 slippers[1]="CasualSlippers";
   slippers[2]="SportsSlippers";
   slippers[3]="RubberSlippers";
    slippers[4]="LeatherSlippers";
    slippers[5]="SoftSlippers";
    slippers[6]="BeachSlippers";
     slippers[7]="HomeSlippers";
     slippers[8]="FancySlippers";
     slippers[9]="PrintedSlippers";
     slippers[10]="FlatSlippers";
     slippers[11]="ComfortSlippers";
     slippers[12]="VelcroSlippers";
     slippers[13]="StylishSlippers";

  String[] kids = new String[14];
   kids[0]="KidsShirt";
    kids[1]="KidsPant";
    kids[2]="KidsTshirt";
    kids[3]="KidsShorts";
    kids[4]="KidsFrock";
    kids[5]="KidsJeans";
   kids[6]="KidsJacket";
   kids[7]="KidsShoes";
   kids[8]="KidsSocks";
   kids[9]="KidsCap";
    kids[10]="KidsDress";
    kids[11]="KidsNightWear";
    kids[12]="KidsUniform";
    kids[13]="KidsSweater";

  String[] men = new String[14];
   men[0]="Shirt";
   men[1]="Pant";
   men[2]="Tshirt";
    men[3]="Jeans";
  men[4]="Jacket";
  men[5]="Kurta";
   men[6]="Shorts";
   men[7]="Blazer";
   men[8]="Hoodie";
   men[9]="Shoes";
   men[10]="Watch";
   men[11]="Cap";
   men[12]="Belt";
   men[13]="Wallet";

   String[] women = new String[14];
    women[0]="Saree";
    women[1]="Kurti";
     women[2]="Top";
     women[3]="Jeans";
     women[4]="Skirt";
     women[5]="Dress";
     women[6]="Jacket";
     women[7]="Leggings";
      women[8]="Handbag";
     women[9]="Sandals";
     women[10]=Watch";
     women[11]="Scarf";
      women[12]="Shoes";
      women[13]="Jewellery";

   String[][] sections = {slippers, kids, men, women};

    for(int i=0;i<sections.length;i++){
     System.out.println("Section "+i);
      for(int j=0;j<sections[i].length;j++){
       System.out.println("Index : "+j);
        System.out.println(sections[i][j]);
 }
 }
   int sec=0;
    for(String[] section:sections){
    System.out.println("Section "+sec);
     int index=0;
      sec++;
   for(String item:section){
     System.out.println("Index : "+index);
      System.out.println(item);
      index++;
  }
  }
    }
}