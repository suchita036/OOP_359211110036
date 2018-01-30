package oop_lap8;

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Abstract Mekehod
    public abstract void makeNoise();

    @Override
    public String toString() {
        return "" "\
        Pet {
            name = '$name',
                    age = $age
        } "" "
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
