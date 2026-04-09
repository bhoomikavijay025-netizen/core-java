class OrionMall{

 void display(){

  String[] foodSection = {"Oil","Flour","Pepper","Gingerpaste","Rice","Gramflour","Teapowder","","Garlicpaste","Butter",
  "Greenchilli","Curd","Cheese","Paneer","Money" };
     String[] fashionSection = { "Shirt","Jeans","Tshirt","Jacket","Kurta","Saree","Skirt","Shorts","Sweater","Blazer",
            "Hoodie","Cap","Scarf","Gloves","Socks"};

     String[] gadgetSection = { "Mobile","Laptop","Tablet","Camera","Speaker","Headphones","TV","Fan","AC","Fridge",
            "Iron","Watch","Charger","Mixer","Oven" };

   String[] furnitureSection = {"Chair","Table","Sofa","Bed","Cupboard","Mirror","Bucket","Mug","Mat","Curtains",
            "Pillow","Blanket","Lamp","Clock","Shelf" };

     String[] snacksSection = {"Chips","Biscuits","Chocolate","Noodles","Juice","Cake","Cookies","Popcorn","Namkeen","SoftDrink",
            "IceCream","Candy","Wafers","Brownie","Pastry"};

     String[][] sections = {foodSection, fashionSection, gadgetSection, furnitureSection, snacksSection};

      for (int i = 0; i < sections.length; i++) {
       System.out.println("Section " + i);

      for (int j = 0; j < sections[i].length; j++) {
         System.out.println("Index : " + j);
          System.out.println(sections[i][j]);
 }
  }
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