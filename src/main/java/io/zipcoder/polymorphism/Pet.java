package io.zipcoder.polymorphism;

public abstract class Pet {

    public String name;

    public Pet() {

    }

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract String speak();
}
