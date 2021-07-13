package test.java.com.myproject;

import main.java.com.myproject.App;
import org.junit.Assert;

public class UTest3 {
    //teting numOfUniqueElements

    public void test() {
        App object = new App();

        object.addElement(3);
        object.addElement(4);
        object.addElement(9);
        object.addElement(3);
        object.addElement(4);

        Assert.assertEquals(3, object.numOfUniqueElements());
    }
}
