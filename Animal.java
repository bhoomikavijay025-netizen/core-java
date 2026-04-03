class Animal{

    String name;
    String type;
    int age;
    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        System.out.println("Animal added successfully");
 }
    public Animal(String name) {
    this.name = name;

  System.out.println(" accessed successfully");
  }
    public Animal(String name, String type) {
        System.out.println( name);
        System.out.println(type);
    }
}