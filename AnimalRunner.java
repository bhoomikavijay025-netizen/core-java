class AnimalRunner {

    public static void main(String[] args) {
       System.out.println("Add Animals");

    Animal muddu = new Animal("Muddu", "Dog", 3);
   Animal mudduma = new Animal("Mudduma", "Cat", 2);
     System.out.println("Access Animals");

    Animal a1 = new Animal("Muddu");
    Animal a2 = new Animal("Mudduma");
     System.out.println("View Details");
	 
     Animal v1 = new Animal("Muddu", "Dog");
  Animal v2 = new Animal("Mudduma", "Cat");
    }
}