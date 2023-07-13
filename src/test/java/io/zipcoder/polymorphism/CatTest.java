package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testCatSpeak(){
        String expected = "Mrrrrroooooowwwww";
        Cat cat = new Cat();

        String actual = cat.speak();

       Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCatName(){
        String expected = "Professor Walter Cattens";
        Cat cat = new Cat(expected);

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        String expected = "Lucy";
        Cat cat = new Cat();

        cat.setName(expected);
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }
}
