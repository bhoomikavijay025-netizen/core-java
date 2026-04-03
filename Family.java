class Family{

    String name;
    String relation;
    int age;
    public Family(String name, String relation, int age) {
        this.name = name;
        this.relation = relation;
        this.age = age;

   System.out.println("Family member added successfully");
  }
   public Family(String name) {
  this.name = name;

  System.out.println(name + " accessed successfully");
    }
    public Family(String name, String relation) {
        System.out.println( name);
        System.out.println( relation);
    }
}