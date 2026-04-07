class Pen{

    int getPrice(){
      int price = 20;
    
  System.out.println(price);
    return price;
 }

  void displayBrand(String brand){
    System.out.println(brand);

    int price = getPrice();
	System.out.println(price);
  }

    void showDetails() {
    System.out.println("Pen details");
    displayBrand("Reynolds");
  }
}