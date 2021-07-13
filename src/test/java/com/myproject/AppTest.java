package test.java.com.myproject;

import org.junit.Test;

import main.java.com.myproject.App;

import org.junit.Assert;

public class AppTest {

    //testing getSize
    @Test
    public void test1() {
        App object = new App();
        object.addElement(2);
        object.addElement(5);
        object.addElement(9);

        Assert.assertEquals(3, object.getSize());
    }

    //testing getSum
    @Test
    public void test2() {
        App object = new App();
        object.addElement(3);
        object.addElement(4);
        object.addElement(-9);
        object.addElement(2);

        Assert.assertEquals(0, object.getSum());
    }

    @Test
    //teting numOfUniqueElements
    public void test3() {
        App object = new App();

        object.addElement(3);
        object.addElement(4);
        object.addElement(9);
        object.addElement(3);
        object.addElement(4);

        Assert.assertEquals(3, object.numOfUniqueElements());
    }
}
