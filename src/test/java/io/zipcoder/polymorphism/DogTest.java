package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testDogSpeak(){
        String expected = "Bow wow!";
        Dog dog = new Dog();

        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName(){
        String expected = "Charles Xavier";
        Dog dog = new Dog(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        String expected = "Amy";
        Dog dog = new Dog("Twinkie");
        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
}
