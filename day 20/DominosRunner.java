class DominosRunner {

    public static void main(String[] args) {

   System.out.println("---- Dominos Bill ----");

    System.out.println("Veg Pizza : ₹" + Dominos.getPrice("Veg Pizza", 1));
  System.out.println("Veg Pizza : ₹" + Dominos.getPrice("Veg Pizza", 2));

  System.out.println("Chicken Pizza : ₹" + Dominos.getPrice("Chicken Pizza", 1));
 System.out.println("Chicken Pizza : ₹" + Dominos.getPrice("Chicken Pizza", 2));

 System.out.println("Cheese Burst : ₹" + Dominos.getPrice("Cheese Burst", 1));
  System.out.println("Cheese Burst : ₹" + Dominos.getPrice("Cheese Burst", 2)); 
  System.out.println("Gothilde iro Item : ₹" + Dominos.getPrice("Burger", 1));
    }
}