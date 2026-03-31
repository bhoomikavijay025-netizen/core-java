class ToyRunner {
    public static void main(String[] args) {

String name = Toy.getToyName();
   System.out.println(name);

 int id = Toy.getToyId();
     System.out.println(id);

  double rating = Toy.getRating();
  System.out.println(rating);

   float price = Toy.getPrice();
 System.out.println(price);

   long sold = Toy.getTotalSold();
   System.out.println(sold);

   boolean battery = Toy.getIsBatteryOperated();
   System.out.println(battery);

   char category = Toy.getToyCategory();
   System.out.println(category);
    }

	}