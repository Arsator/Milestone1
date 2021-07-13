package test.java.com.myproject;

import org.junit.Test;

import main.java.com.myproject.App;

import org.junit.Assert;

public class UTest1 {

    //testing getSize
    public void test() {
        App object = new App();
        object.addElement(2);
        object.addElement(5);
        object.addElement(9);

        Assert.assertEquals(3, object.getSize());
    }
}
