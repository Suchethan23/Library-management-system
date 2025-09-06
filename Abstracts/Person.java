package Abstracts;

    abstract public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    // Abstract method (must be implemented by subclasses)
    public abstract void displayInfo();

}