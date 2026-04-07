class Animal {

    int getAge(){
     int age = 5;
      System.out.println( "age is:" +age);
     return age;
 }
    void displayType(String type){
     System.out.println(type);
   int age = getAge();
    System.out.println(age);
    }

   void showDetails() {
    System.out.println("Animal details");

     displayType("Muddu");
    }
}