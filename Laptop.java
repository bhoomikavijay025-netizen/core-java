class Laptop {
  public static void main(String[] args){

    showProduct();
    showPrice(60000,55000);

    int stock = getStock();
    System.out.println("Stock: "+stock);

    int total = calculateTotal(60000,5000);
    System.out.println("Total Price: "+total);
  }
  public static void showProduct(){
    System.out.println("Product: Laptop");
  }

  public static void showPrice(int p1,int p2){
    System.out.println("Price1: "+p1);
    System.out.println("Price2: "+p2);
  }

  public static int getStock(){
    return 30;
  }
  public static int calculateTotal(int a,int b){
    return a+b;
  }
  
}