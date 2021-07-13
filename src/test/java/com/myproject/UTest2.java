package test.java.com.myproject;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.myproject.App;

public class UTest2 {
    
    //testing getSum

    public void test() {
        App object = new App();
        object.addElement(3);
        object.addElement(4);
        object.addElement(-9);
        object.addElement(2);

        Assert.assertEquals(0, object.getSum());
    }
}
