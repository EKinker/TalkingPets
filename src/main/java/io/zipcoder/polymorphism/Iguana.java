package io.zipcoder.polymorphism;

public class Iguana extends Pet{

    public Iguana(){
        super("");
    }

    public Iguana(String name) {
        super(name);
    }

    public String speak() {
        return "...";
    }
}
