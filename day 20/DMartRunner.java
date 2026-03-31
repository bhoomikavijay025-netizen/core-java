class DMartRunner {

    public static void main(String[] args) {

   System.out.println("Rice : ₹" + DMart.getPrice("Rice", 1));
   System.out.println("Rice : ₹" + DMart.getPrice("Rice", 2));

 System.out.println("Oil : ₹" + DMart.getPrice("Oil", 1));
    System.out.println("Oil : ₹" + DMart.getPrice("Oil", 3));

   System.out.println("Sugar : ₹" + DMart.getPrice("Sugar", 1));
  System.out.println("Sugar : ₹" + DMart.getPrice("Sugar", 2));
  System.out.println("Sugar : ₹" + DMart.getPrice("Sugar", 3));

   System.out.println("Unknown Item : ₹" + DMart.getPrice("Milk", 1));
    }
}