package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {


    @Test
    public void testCatInheritance() {
        Pet cat = new Cat();

        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void testDogInheritance(){
        Pet dog = new Dog();

        Assert.assertTrue(dog instanceof Pet);

    }

    @Test
    public void testIguanaInheritance() {
        Pet iguana = new Iguana();

        Assert.assertTrue(iguana instanceof Pet);
    }
}
