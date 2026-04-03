class Tree {

    String name;
    int height;
    String type;

    public Tree(String name, int height, String type) {
        this.name = name;
        this.height = height;
        this.type = type;

        System.out.println("Tree added successfully");
    }
    public Tree(String name) {
        this.name = name;

        System.out.println(" tree accessed");
    }

    public Tree(String name, String type) {
        System.out.println("Tree Name: " + name);
        System.out.println("Type: " + type);
    }
}