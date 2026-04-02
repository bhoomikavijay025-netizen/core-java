class ShoppingMallEntry {

  static String checkTicket(String name, int age) {
   String output = "Yes this person can enter the shopping mall";
   System.out.println("Checking the age");

  if(age >= 18) {
    System.out.println("Yes this person CAN enter the shopping mall. Name: " + name);
      System.out.println("Age: " + age);
  return output;
      } else {
     System.out.println("No this person CANNOT enter the shopping mall. Name: " + name);
    System.out.println("Age is less than 18: " + age);
   }
  return "This person cannot enter the shopping mall";
    }
	public static void main(String[] args) {
String result =  checkTicket("Ramya",21);
	System.out.println(result);
		}	
}