class Tablet{
     public static void main(String[] args){

    showProduct();
	
    showPrice(35000,30000);
    int stock=getStock();
    System.out.println("Stock: "+stock);
    int total=calculateTotal(35000,2000);
    System.out.println("Total Price: "+total);
  }
  public static void showProduct(){
    System.out.println("Product: Tablet");
  }

  public static void showPrice(int a,int b){
    System.out.println("Price1: "+a);
    System.out.println("Price2: "+b);
  }
  public static int getStock(){
    return 20;
  }

  public static int calculateTotal(int a,int b){
    return a+b;
  }
}