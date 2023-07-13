package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class IguanaTest {

    @Test
    public void testIguanaSpeak(){
        String expected = "...";
        Iguana iguana = new Iguana();
        String actual = iguana.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        String expected = "Virgil";
        Iguana iguana = new Iguana(expected);
        String actual = iguana.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        String expected = "Max";
        Iguana iguana = new Iguana("Jeremy");
        iguana.setName(expected);
        String actual = iguana.getName();
        Assert.assertEquals(expected, actual);
    }


}
