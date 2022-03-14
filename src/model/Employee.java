package model;

public class Employee extends Person {
    private int id;
    private String name;
    private String profession;

    public Employee(int age, int id, String name, String profession) {
        super(age);
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
