class PhoneRunner {
     public static void main(String[] args) {

 String brand = Phone.getBrand();
  System.out.println(brand); 
 int price = Phone.getPrice();
  System.out.println(price);
   double screen = Phone.getScreenSize();
   System.out.println(screen);
   boolean supported = Phone.getIs5GSupported();
  System.out.println(supported);
    }
}
